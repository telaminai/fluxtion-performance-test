package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;

/**
 * Shared utilities for all dimension JMH benchmarks.
 *
 * Provides:
 *  - buildFluxtionProcessor(generator, config, size) — loads the pre-AOT-compiled
 *    Fluxtion processor for the given dimension/size via reflection.
 *  - HDR record helpers delegating to BenchmarkResultsWriter.
 *
 * PRE-REQUISITE: Run GenerateAllProcessors then "mvn compile" before benchmarking:
 *   mvn compile exec:java -Dexec.mainClass="...generators.GenerateAllProcessors"
 *   mvn compile
 *
 * JMH @State and @Benchmark annotations live in the concrete subclass only.
 */
public abstract class DimensionBenchmarkBase {

    /**
     * Loads the pre-AOT-compiled Fluxtion processor for the given dimension/size.
     * The processor class must already be on the classpath (generated and compiled
     * by GenerateAllProcessors + "mvn compile" before running benchmarks).
     */
    protected static DataFlow buildFluxtionProcessor(GraphGeneratorBase generator,
                                                      BenchmarkConfig config,
                                                      int size) throws Exception {
        String processorName = toProcessorName(config.getDimension(), size);
        String fqn = config.getGeneratedPackage() + "." + processorName;
        try {
            Class<?> cls = Class.forName(fqn);
            DataFlow processor = (DataFlow) cls.getDeclaredConstructor().newInstance();
            processor.init();
            return processor;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(
                    "Pre-generated processor not found: " + fqn + "\n" +
                    "Run: mvn compile exec:java " +
                    "-Dexec.mainClass=com.telamin.fluxtion.test.performance.generators.GenerateAllProcessors\n" +
                    "Then: mvn compile\nThen re-run benchmarks.");
        }
    }

    /** Same naming convention as GenerateAllProcessors.toProcessorName(). */
    private static String toProcessorName(String dimension, int size) {
        String[] parts = dimension.split("_");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                sb.append(Character.toUpperCase(part.charAt(0)));
                sb.append(part.substring(1));
            }
        }
        sb.append(size).append("Processor");
        return sb.toString();
    }

    /** Convenience: record a Fluxtion latency sample. */
    protected static void recordFluxtion(String dimension, int size, long nanos) {
        BenchmarkResultsWriter.record(dimension + "/fluxtion/" + size, nanos);
    }

    /** Convenience: record an RxJava latency sample. */
    protected static void recordRxJava(String dimension, int size, long nanos) {
        BenchmarkResultsWriter.record(dimension + "/rxjava/" + size, nanos);
    }
}
