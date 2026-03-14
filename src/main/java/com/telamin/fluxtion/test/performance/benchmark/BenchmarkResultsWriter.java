package com.telamin.fluxtion.test.performance.benchmark;

import org.HdrHistogram.Histogram;
import org.HdrHistogram.HistogramLogWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Thread-safe HDR histogram collector for benchmark dimensions.
 *
 * Usage in @Benchmark methods:
 *   long start = System.nanoTime();
 *   // ... work ...
 *   BenchmarkResultsWriter.record("deep_path/fluxtion/20", System.nanoTime() - start);
 *
 * At the end of a run call BenchmarkResultsWriter.writeAll("target/results") to
 * flush every histogram as a .hlog file that HdrHistogram tools can read.
 */
public class BenchmarkResultsWriter {

    // 1ns to 10s range, 3 significant figures
    private static final long HIGHEST_TRACKABLE = 10_000_000_000L;
    private static final int  SIGNIFICANT_DIGITS = 3;

    private static final Map<String, Histogram> HISTOGRAMS = new ConcurrentHashMap<>();

    /** Record a single latency sample (nanoseconds) for the given label. */
    public static void record(String label, long latencyNs) {
        HISTOGRAMS.computeIfAbsent(label,
                        k -> new Histogram(HIGHEST_TRACKABLE, SIGNIFICANT_DIGITS))
                .recordValue(Math.min(latencyNs, HIGHEST_TRACKABLE));
    }

    /**
     * Write all accumulated histograms to outDir as .hlog files.
     * One file per label, with slashes converted to underscores.
     */
    public static void writeAll(String outDir) {
        try {
            Files.createDirectories(Paths.get(outDir));
        } catch (Exception e) {
            System.err.println("[BenchmarkResultsWriter] Cannot create output dir: " + e.getMessage());
            return;
        }
        for (Map.Entry<String, Histogram> entry : HISTOGRAMS.entrySet()) {
            String filename = entry.getKey().replace("/", "_").replace(" ", "_") + ".hlog";
            File outFile = Paths.get(outDir, filename).toFile();
            try (PrintStream ps = new PrintStream(outFile)) {
                HistogramLogWriter writer = new HistogramLogWriter(ps);
                writer.outputComment("label=" + entry.getKey());
                writer.outputComment("generatedAt=" + Instant.now());
                writer.outputIntervalHistogram(entry.getValue());
                System.out.println("[BenchmarkResultsWriter] wrote " + outFile);
            } catch (FileNotFoundException e) {
                System.err.println("[BenchmarkResultsWriter] Failed to write " + outFile + ": " + e.getMessage());
            }
        }
    }

    /** Print a summary table to stdout for quick inspection. */
    public static void printSummary() {
        System.out.printf("%n%-50s %10s %10s %10s %10s %10s %10s%n",
                "Label", "p50(ns)", "p90(ns)", "p99(ns)", "p99.9(ns)", "p99.99(ns)", "max(ns)");
        System.out.println("-".repeat(114));
        HISTOGRAMS.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                    Histogram h = e.getValue();
                    System.out.printf("%-50s %10d %10d %10d %10d %10d %10d%n",
                            e.getKey(),
                            h.getValueAtPercentile(50),
                            h.getValueAtPercentile(90),
                            h.getValueAtPercentile(99),
                            h.getValueAtPercentile(99.9),
                            h.getValueAtPercentile(99.99),
                            h.getMaxValue());
                });
    }

    /** Reset all histograms (useful between @Benchmark warmup and measurement). */
    public static void reset() {
        HISTOGRAMS.values().forEach(Histogram::reset);
    }

    public static void reset(String label) {
        Histogram h = HISTOGRAMS.get(label);
        if (h != null) h.reset();
    }
}
