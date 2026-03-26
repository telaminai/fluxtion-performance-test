package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.Fluxtion;
import com.telamin.fluxtion.builder.extern.spring.FluxtionSpring;
import org.openjdk.jmh.Main;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

/**
 * Orchestrator: deletes all previously generated processors, regenerates every
 * processor from its YAML config and Spring XML graph, and optionally runs the
 * full JMH benchmark suite afterwards.
 */
public class GenerateAllProcessors {

    /** Source root for derived generated-package directories. */
    private static final String SRC_ROOT =
            "src/main/java/";

    private static final Pattern LINE_NUM_PATTERN = Pattern.compile("^\\s*\\d+:\\s(.*)$");

    /** All known dimension configs, in the order they will be processed. */
    private static final Map<String, Class<? extends GraphGeneratorBase>> GENERATORS =
            new LinkedHashMap<>();

    static {
        GENERATORS.put("benchmark-configs/deep_path.yaml",             DeepPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/noop_dispatch.yaml",         DeepPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/diamond_mesh.yaml",          DiamondMeshGraphGenerator.class);
        GENERATORS.put("benchmark-configs/hot_path.yaml",              HotPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/polymorphic.yaml",           PolymorphicGraphGenerator.class);
        GENERATORS.put("benchmark-configs/dirty_filter.yaml",          DirtyFilterGraphGenerator.class);
        GENERATORS.put("benchmark-configs/intermediate_handlers.yaml", IntermediateHandlersGraphGenerator.class);
        GENERATORS.put("benchmark-configs/multi_event_path.yaml",      MultiEventPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/validation_diamond.yaml",
                com.telamin.fluxtion.test.performance.validation.generator.ValidationDiamondGenerator.class);
        GENERATORS.put("benchmark-configs/short_chain.yaml",           ShortChainGraphGenerator.class);
    }

    public static void main(String[] args) throws Exception {
        boolean runBenchmarks = Arrays.asList(args).contains("--run-benchmarks");

        // Force console output so we can capture it
        System.clearProperty(SOURCE_GENERATOR_ID_PROPERTY);
        System.setProperty("fluxtion.generate.source", "true");

        // ── 1. Delete all previously generated processors ──────────────────
        deleteGeneratedProcessors();


        // ── 3. Regenerate all dimension processors from YAML configs ────────
        int totalGraphs = 0;
        int totalErrors = 0;

        for (Map.Entry<String, Class<? extends GraphGeneratorBase>> entry : GENERATORS.entrySet()) {
            String yamlResource = entry.getKey();
            GraphGeneratorBase generator = entry.getValue().getDeclaredConstructor().newInstance();

            BenchmarkConfig config = GraphGeneratorBase.loadConfig(yamlResource);
            System.out.printf("%n=== Dimension: %s (%s) ===%n",
                    config.getDimension(), config.getTitle());

            boolean specializedRun = false;
            for (int size : config.getSizes()) {
                System.out.printf("  [%s] size=%d%n", config.getDimension(), size);
                try {
                    Path xmlPath = generator.generate(config, size);

                    String processorName = toProcessorName(config.getDimension(), size);
                    String pkg = config.getGeneratedPackage();

                    if (config.getDimension().equals("deep_path") || config.getDimension().equals("noop_dispatch")) {
                        if (!specializedRun) {
                            // Specialized generation for these two to disable dirty flags and use concrete nodes
                            System.out.printf("  [%s] Using specialized DeepPathNoDirtyGenerator...%n", config.getDimension());
                            DeepPathNoDirtyGenerator.main(new String[0]);
                            specializedRun = true;
                        }
                    } else {
                        captureAndWrite(xmlPath.toString(), processorName, pkg);
                    }

                    totalGraphs++;
                    System.out.printf("  [%s] size=%d -> %s.%s  OK%n",
                            config.getDimension(), size, pkg, processorName);

                } catch (Exception e) {
                    totalErrors++;
                    System.err.printf("  [%s] size=%d FAILED: %s%n",
                            config.getDimension(), size, e.getMessage());
                    e.printStackTrace(System.err);
                }
            }
        }

        System.out.printf("%n=== Done: %d processors generated, %d errors ===%n",
                totalGraphs, totalErrors);

        // ── 4. Optionally run benchmarks ────────────────────────────────────
        if (runBenchmarks) {
            System.out.println("\n=== Running JMH benchmarks ===");
            Main.main(new String[0]);
        }

        if (totalErrors > 0) System.exit(1);
    }

    private static void captureAndWrite(String xmlFilePath, String processorName, String pkg) throws Exception {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream captureStream = new PrintStream(baos);

        System.setOut(captureStream);
        System.setErr(captureStream);
        try {
            compileAot(xmlFilePath, processorName, pkg);
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }

        String captured = baos.toString(StandardCharsets.UTF_8);
        String cleanSource = stripLineNumbers(captured);

        if (cleanSource.isEmpty()) {
            System.out.println("Captured output: " + captured);
            throw new IllegalStateException("No source captured for " + processorName);
        }

        Path targetPath = Paths.get(SRC_ROOT, pkg.replace('.', '/'), processorName + ".java");
        Files.createDirectories(targetPath.getParent());
        Files.writeString(targetPath, cleanSource);
    }

    private static String stripLineNumbers(String captured) {
        StringBuilder sb = new StringBuilder();
        boolean inSource = false;
        try (BufferedReader reader = new BufferedReader(new StringReader(captured))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("=== GENERATED SOURCE START ===")) {
                    inSource = true;
                    continue;
                }
                if (line.contains("=== GENERATED SOURCE END ===")) {
                    inSource = false;
                    continue;
                }
                if (inSource) {
                    Matcher m = LINE_NUM_PATTERN.matcher(line);
                    if (m.find()) {
                        sb.append(m.group(1)).append("\n");
                    } else {
                        sb.append(line).append("\n");
                    }
                }
            }
        } catch (IOException e) {
            // ignore
        }
        return sb.toString();
    }

    private static void compileAot(String xmlFilePath, String processorName, String pkg)
            throws IOException {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(GenerateAllProcessors.class.getClassLoader());
        try {
            FileSystemXmlApplicationContext ctx =
                    new FileSystemXmlApplicationContext(xmlFilePath);
            try {
                Fluxtion.compile(procCfg -> {
                    ctx.getBeansOfType(Object.class).values().forEach(procCfg::addNode);
                }, compilerCfg -> {
                    compilerCfg.className(processorName).packageName(pkg);
                });
            } finally {
                ctx.close();
            }
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Deletes all *.java files from every generated-package directory that is
     * declared across the YAML configs, plus the root generated package that
     * holds DiamondMeshProcessor.
     */
    private static void deleteGeneratedProcessors() throws Exception {
        System.out.println("=== Deleting previously generated processors ===");

        // Root generated package (DiamondMeshProcessor lives here)
        deleteJavaFilesIn("com.telamin.fluxtion.test.performance.generated");
        deleteJavaFilesIn("com.telamin.fluxtion.test.performance.generated.deep");
        deleteJavaFilesIn("com.telamin.fluxtion.test.performance.generated.noop");

        // Each dimension's generated package
        for (String yamlResource : GENERATORS.keySet()) {
            BenchmarkConfig config = GraphGeneratorBase.loadConfig(yamlResource);
            deleteJavaFilesIn(config.getGeneratedPackage());
        }
    }

    /**
     * Deletes all *.java files directly inside the directory that corresponds
     * to the given fully-qualified package name (non-recursive).
     */
    private static void deleteJavaFilesIn(String packageName) throws IOException {
        Path dir = Paths.get(SRC_ROOT + packageName.replace('.', '/'));
        if (!Files.exists(dir)) return;
        Files.walk(dir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    try {
                        Files.deleteIfExists(p);
                        System.out.printf("  deleted %s%n", p);
                    } catch (IOException e) {
                        System.err.printf("  failed to delete %s: %s%n", p, e.getMessage());
                    }
                });
    }

    /**
     * Converts "deep_path" + 20 -> "DeepPath20Processor"
     * Converts "hot_path"  + 4  -> "HotPath4Processor"
     */
    static String toProcessorName(String dimension, int size) {
        String[] parts = dimension.split("_");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                sb.append(Character.toUpperCase(part.charAt(0)));
                sb.append(part.substring(1));
            }
        }
        sb.append(size);
        sb.append("Processor");
        return sb.toString();
    }
}
