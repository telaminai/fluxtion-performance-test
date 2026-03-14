package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.builder.extern.spring.FluxtionSpring;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

/**
 * Orchestrator: for every YAML config in benchmark-configs/, generates the
 * Spring XML graph (via the declared generator class) and then invokes the
 * Fluxtion AOT compiler to produce a typed Java processor per size.
 *
 * Run this once before benchmarking whenever node classes or configs change:
 *
 *   mvn compile exec:java \
 *     -Dexec.mainClass="com.telamin.fluxtion.test.performance.generators.GenerateAllProcessors"
 */
public class GenerateAllProcessors {

    /** All known dimension configs, in the order they will be processed. */
    private static final Map<String, Class<? extends GraphGeneratorBase>> GENERATORS =
            new LinkedHashMap<>();

    static {
        GENERATORS.put("benchmark-configs/deep_path.yaml",            DeepPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/hot_path.yaml",             HotPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/polymorphic.yaml",          PolymorphicGraphGenerator.class);
        GENERATORS.put("benchmark-configs/dirty_filter.yaml",         DirtyFilterGraphGenerator.class);
        GENERATORS.put("benchmark-configs/intermediate_handlers.yaml", IntermediateHandlersGraphGenerator.class);
        GENERATORS.put("benchmark-configs/multi_event_path.yaml",     MultiEventPathGraphGenerator.class);
        GENERATORS.put("benchmark-configs/validation_diamond.yaml",
                com.telamin.fluxtion.test.performance.validation.generator.ValidationDiamondGenerator.class);
    }

    public static void main(String[] args) throws Exception {
        System.setProperty(SOURCE_GENERATOR_ID_PROPERTY, "local");

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
                    // 1. Generate Spring XML
                    Path xmlPath = generator.generate(config, size);

                    // 2. Derive processor name and package
                    String processorName = toProcessorName(config.getDimension(), size);
                    String pkg = config.getGeneratedPackage();

                    // 3. Run Fluxtion AOT compiler
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
        if (totalErrors > 0) System.exit(1);
    }

    // -----------------------------------------------------------------------

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
     * Converts "hot_path" + 4  -> "HotPath4Processor"
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
