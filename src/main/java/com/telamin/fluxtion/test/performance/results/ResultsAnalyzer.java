package com.telamin.fluxtion.test.performance.results;

import org.HdrHistogram.Histogram;
import org.HdrHistogram.HistogramLogReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Reads HDR .hlog files from target/results/ and produces formatted reports
 * suitable for inclusion in the paper.
 *
 * Usage:
 *   mvn exec:java -Dexec.mainClass="com.telamin.fluxtion.test.performance.results.ResultsAnalyzer"
 *
 * Interactive query via args:
 *   -d deep_path          filter by dimension
 *   -f fluxtion           filter by framework (fluxtion|rxjava)
 *   -s 50                 filter by size
 *   -r                    show raw HDR percentile table
 *   -c                    show speedup comparison table (Fluxtion vs RxJava)
 */
public class ResultsAnalyzer {

    record ResultKey(String dimension, String framework, int size) implements Comparable<ResultKey> {
        @Override
        public int compareTo(ResultKey o) {
            int d = dimension.compareTo(o.dimension);
            if (d != 0) return d;
            int f = framework.compareTo(o.framework);
            if (f != 0) return f;
            return Integer.compare(size, o.size);
        }
    }

    record Stats(long p50, long p90, long p99, long p999, long p9999, long max, long count) {}

    // -----------------------------------------------------------------------

    public static void main(String[] args) throws Exception {
        String resultsDir = "target/results";
        Map<ResultKey, Stats> data = loadAll(resultsDir);

        if (data.isEmpty()) {
            System.out.println("No .hlog files found in " + resultsDir +
                    ". Run benchmarks first.");
            return;
        }

        // Parse simple CLI args
        String dimFilter = argValue(args, "-d", null);
        String fwFilter  = argValue(args, "-f", null);
        String sizeArg   = argValue(args, "-s", null);
        Integer sizeFilter = sizeArg == null ? null : Integer.parseInt(sizeArg);
        boolean showRaw  = hasFlag(args, "-r");
        boolean showComp = hasFlag(args, "-c") || (!showRaw);

        Map<ResultKey, Stats> filtered = data.entrySet().stream()
                .filter(e -> dimFilter == null || e.getKey().dimension().contains(dimFilter))
                .filter(e -> fwFilter  == null || e.getKey().framework().contains(fwFilter))
                .filter(e -> sizeFilter == null || e.getKey().size() == sizeFilter)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (a, b) -> a, TreeMap::new));

        if (showRaw) printRawTable(filtered);
        if (showComp) printSpeedupTable(filtered);
    }

    // -----------------------------------------------------------------------
    // Loading
    // -----------------------------------------------------------------------

    public static Map<ResultKey, Stats> loadAll(String dir) throws Exception {
        Map<ResultKey, Stats> results = new TreeMap<>();
        File[] files = new File(dir).listFiles(f -> f.getName().endsWith(".hlog"));
        if (files == null) return results;

        for (File f : files) {
            ResultKey key = parseKey(f.getName().replace(".hlog", ""));
            if (key == null) continue;
            Stats stats = readStats(f);
            if (stats != null) results.put(key, stats);
        }
        return results;
    }

    /** Filename format: dimension_framework_size  (underscores separate parts) */
    private static ResultKey parseKey(String name) {
        // e.g. "deep_path_fluxtion_100" or "intermediate_handlers_rxjava_50"
        // or "validation_fluxtion_market_10"
        for (String fw : new String[]{"fluxtion", "rxjava"}) {
            int idx = name.indexOf("_" + fw + "_");
            if (idx >= 0) {
                String dim  = name.substring(0, idx);
                String rest = name.substring(idx + fw.length() + 2);
                
                // If there's another underscore, it's a subtype (e.g. market, trade, control)
                int subIdx = rest.indexOf("_");
                if (subIdx >= 0) {
                    dim = dim + "/" + rest.substring(0, subIdx);
                    rest = rest.substring(subIdx + 1);
                }
                
                try {
                    return new ResultKey(dim, fw, Integer.parseInt(rest));
                } catch (NumberFormatException ignored) {}
            }
        }
        return null;
    }

    private static Stats readStats(File f) throws Exception {
        try (FileInputStream fis = new FileInputStream(f)) {
            HistogramLogReader reader = new HistogramLogReader(fis);
            Histogram h = null;
            Histogram interval;
            while ((interval = (Histogram) reader.nextIntervalHistogram()) != null) {
                if (h == null) h = interval;
                else h.add(interval);
            }
            if (h == null || h.getTotalCount() == 0) return null;
            return new Stats(
                    h.getValueAtPercentile(50),
                    h.getValueAtPercentile(90),
                    h.getValueAtPercentile(99),
                    h.getValueAtPercentile(99.9),
                    h.getValueAtPercentile(99.99),
                    h.getMaxValue(),
                    h.getTotalCount());
        }
    }

    // -----------------------------------------------------------------------
    // Reporting
    // -----------------------------------------------------------------------

    private static void printRawTable(Map<ResultKey, Stats> data) {
        System.out.printf("%n%-30s %-10s %6s %10s %10s %10s %10s %10s %10s%n",
                "Dimension", "Framework", "Size", "p50(ns)", "p90(ns)", "p99(ns)", "p99.9(ns)", "p99.99(ns)", "max(ns)");
        System.out.println("-".repeat(112));
        data.forEach((k, s) ->
                System.out.printf("%-30s %-10s %6d %10d %10d %10d %10d %10d %10d%n",
                        k.dimension(), k.framework(), k.size(),
                        s.p50(), s.p90(), s.p99(), s.p999(), s.p9999(), s.max()));
    }

    private static void printSpeedupTable(Map<ResultKey, Stats> data) {
        // Group by (dimension, size), pair fluxtion vs rxjava
        Map<String, Map<Integer, Map<String, Stats>>> grouped = new TreeMap<>();
        data.forEach((k, s) ->
                grouped.computeIfAbsent(k.dimension(), d -> new TreeMap<>())
                        .computeIfAbsent(k.size(), sz -> new HashMap<>())
                        .put(k.framework(), s));

        // ---- p50 comparison table ----
        System.out.printf("%n=== Multi-Dimension Latency: p50 (ns/op) ===%n");
        System.out.printf("%-30s %6s %12s %12s %10s %s%n",
                "Dimension", "Size", "Fluxtion p50", "RxJava p50", "Speedup", "Fluxtion wins?");
        System.out.println("-".repeat(92));
        grouped.forEach((dim, sizes) ->
                sizes.forEach((size, fwMap) -> {
                    Stats fx = fwMap.get("fluxtion");
                    Stats rx = fwMap.get("rxjava");
                    if (fx == null || rx == null) return;
                    double speedup = (double) rx.p50() / fx.p50();
                    String winner = speedup >= 1.0 ? "YES  (" + String.format("%.1f", speedup) + "x)" : "no";
                    System.out.printf("%-30s %6d %12d %12d %10.2f %s%n",
                            dim, size, fx.p50(), rx.p50(), speedup, winner);
                }));

        // ---- Tail latency comparison: p99 / p99.9 / p99.99 ----
        System.out.printf("%n=== Tail Latency Comparison (ns) — GC pressure shows up here ===%n");
        System.out.printf("%-30s %6s %10s %10s %10s %10s %10s %10s%n",
                "Dimension", "Size",
                "Fx p99", "Rx p99",
                "Fx p99.9", "Rx p99.9",
                "Fx p99.99", "Rx p99.99");
        System.out.println("-".repeat(108));
        grouped.forEach((dim, sizes) ->
                sizes.forEach((size, fwMap) -> {
                    Stats fx = fwMap.get("fluxtion");
                    Stats rx = fwMap.get("rxjava");
                    if (fx == null || rx == null) return;
                    System.out.printf("%-30s %6d %10d %10d %10d %10d %10d %10d%n",
                            dim, size,
                            fx.p99(), rx.p99(),
                            fx.p999(), rx.p999(),
                            fx.p9999(), rx.p9999());
                }));
    }

    // -----------------------------------------------------------------------
    // Helpers
    // -----------------------------------------------------------------------

    private static String argValue(String[] args, String flag, String def) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals(flag)) return args[i + 1];
        }
        return def;
    }

    private static boolean hasFlag(String[] args, String flag) {
        return Arrays.asList(args).contains(flag);
    }
}
