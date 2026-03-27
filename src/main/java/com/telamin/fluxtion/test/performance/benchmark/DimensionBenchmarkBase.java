package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;

/**
 * Shared utilities for all dimension JMH benchmarks.
 */
public abstract class DimensionBenchmarkBase {

    public static DataFlow buildFluxtionProcessor(String dimension, int size) throws Exception {
        String pkg = switch (dimension) {
            case "deep_path"             -> "com.telamin.fluxtion.test.performance.generated.deep";
            case "noop_dispatch"         -> "com.telamin.fluxtion.test.performance.generated.noop";
            case "diamond_mesh"          -> "com.telamin.fluxtion.test.performance.generated.diamond";
            case "hot_path"              -> "com.telamin.fluxtion.test.performance.generated.hotpath";
            case "polymorphic"           -> "com.telamin.fluxtion.test.performance.generated.polymorphic";
            case "dirty_filter"          -> "com.telamin.fluxtion.test.performance.generated.dirtyfilter";
            case "intermediate_handlers" -> "com.telamin.fluxtion.test.performance.generated.intermediate";
            case "multi_event_path"      -> "com.telamin.fluxtion.test.performance.generated.multievent";
            case "short_chain"           -> "com.telamin.fluxtion.test.performance.generated.service";
            case "validation"            -> "com.telamin.fluxtion.test.performance.validation.generated";
            default -> throw new IllegalArgumentException("Unknown dimension: " + dimension);
        };

        String processorName = toProcessorName(dimension, size);
        String fqn = pkg + "." + processorName;
        try {
            Class<?> cls = Class.forName(fqn);
            DataFlow processor = (DataFlow) cls.getDeclaredConstructor().newInstance();
            processor.init();
            return processor;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Pre-generated processor not found: " + fqn);
        }
    }

    private static String toProcessorName(String dimension, int size) {
        if (dimension.equals("validation")) return "ValidationDiamond" + size + "Processor";
        if (dimension.equals("noop_dispatch")) return "NoopDispatch" + size + "Processor";
        if (dimension.equals("short_chain")) return "ShortChain" + size + "Processor";
        
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
}
