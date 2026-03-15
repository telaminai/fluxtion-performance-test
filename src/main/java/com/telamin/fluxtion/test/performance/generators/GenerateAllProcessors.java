package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.builder.extern.spring.FluxtionSpring;
import org.openjdk.jmh.Main;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

/**
 * Orchestrator: deletes all previously generated processors, regenerates every
 * processor from its YAML config and Spring XML graph, and optionally runs the
 * full JMH benchmark suite afterwards.
 *
 * Usage (IntelliJ): run main() directly.
 *
 * Usage (Maven):
 *   # generate only
 *   mvn compile exec:java \
 *     -Dexec.mainClass="com.telamin.fluxtion.test.performance.generators.GenerateAllProcessors"
 *
 *   # generate then benchmark
 *   mvn compile exec:java \
 *     -Dexec.mainClass="com.telamin.fluxtion.test.performance.generators.GenerateAllProcessors" \
 *     -Dexec.args="--run-benchmarks"
 */
public class GenerateAllProcessors {

    /** Source root for derived generated-package directories. */
    private static final String SRC_ROOT =
            "src/main/java/";

    /** All known dimension configs, in the order they will be processed. */
    private static final Map<String, Class<? extends GraphGeneratorBase>> GENERATORS =
            new LinkedHashMap<>();

    static {
        GENERATORS.put("benchmark-configs/deep_path.yaml",             DeepPathGraphGenerator.class);
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

        System.setProperty(SOURCE_GENERATOR_ID_PROPERTY, "local");

        // ── 1. Delete all previously generated processors ──────────────────
        deleteGeneratedProcessors();

        // ── 2. Regenerate DiamondMeshProcessor (benchmark-graph.xml) ───────
        System.out.println("\n=== Regenerating DiamondMeshProcessor (benchmark-graph.xml) ===");
        compileAot(
                "src/main/resources/benchmark-graph.xml",
                "DiamondMeshProcessor",
                "com.telamin.fluxtion.test.performance.generated");

        // ── 3. Regenerate all dimension processors from YAML configs ────────
        int totalGraphs = 0;
        int totalErrors = 0;

        for (Map.Entry<String, Class<? extends GraphGeneratorBase>> entry : GENERATORS.entrySet()) {
            String yamlResource = entry.getKey();
            GraphGeneratorBase generator = entry.getValue().getDeclaredConstructor().newInstance();

            BenchmarkConfig config = GraphGeneratorBase.loadConfig(yamlResource);
            System.out.printf("%n=== Dimension: %s (%s) ===%n",
                    config.getDimension(), config.getTitle());

            for (int size : config.getSizes()) {
                System.out.printf("  [%s] size=%d%n", config.getDimension(), size);
                try {
                    Path xmlPath = generator.generate(config, size);

                    String processorName = toProcessorName(config.getDimension(), size);
                    String pkg = config.getGeneratedPackage();

                    compileAot(xmlPath.toString(), processorName, pkg);

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

        File[] javaFiles = dir.toFile().listFiles(
                (d, name) -> name.endsWith(".java"));
        if (javaFiles == null || javaFiles.length == 0) return;

        for (File f : javaFiles) {
            Files.delete(f.toPath());
            System.out.printf("  deleted %s%n", f.getName());
        }
    }

    private static void compileAot(String xmlFilePath, String processorName, String pkg)
            throws IOException {
        FileSystemXmlApplicationContext ctx =
                new FileSystemXmlApplicationContext(xmlFilePath);
        try {
            FluxtionSpring.compileAot(ctx, processorName, pkg);
        } catch (Exception e) {
            // compileAot writes the Java source to disk before attempting in-memory
            // compilation. The in-memory step fails in Maven exec because the
            // tool's classpath is not visible to javax.tools.JavaCompiler.
            // We catch (not rethrow) the error so the source file stays on disk;
            // a subsequent "mvn compile" will compile it with the correct classpath.
            System.out.printf("  [note] in-memory compile skipped for %s.%s " +
                    "(source written to disk — recompile with 'mvn compile')%n", pkg, processorName);
        } finally {
            ctx.close();
        }
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
