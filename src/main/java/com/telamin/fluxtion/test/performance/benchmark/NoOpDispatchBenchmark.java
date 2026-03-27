package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.nodes.NoOpPublisherNode;
import org.HdrHistogram.Histogram;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

/**
 * Dimension: noop_dispatch
 *
 * Measures pure framework dispatch overhead using NoOpNodes.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class NoOpDispatchBenchmark extends DimensionBenchmarkBase {
    private static final String DIM = "noop_dispatch";

    @Param({"5", "10", "20", "50", "100"})
    public int size;

    private DataFlow fluxtionProcessor;
    private NoOpPublisherNode sink;
    private final MarketDataEvent reuseEvent = new MarketDataEvent("BTC", 100.0, 101.0, 0);
    private Histogram histFx;
    private long seq = 0;

    @Setup
    public void setup() throws Exception {
        String fluxtionKey = DIM + "/fluxtion/" + size;
        fluxtionProcessor = buildFluxtionProcessor(DIM, size);
        histFx = BenchmarkResultsWriter.getHistogram(fluxtionKey);

        // Reflection to find the sink node (Fluxtion generates private fields)
        for (java.lang.reflect.Field field : fluxtionProcessor.getClass().getDeclaredFields()) {
            if (NoOpPublisherNode.class.isAssignableFrom(field.getType()) &&
                    (field.getName().equalsIgnoreCase("sink") || field.getName().toLowerCase().contains("publisher"))) {
                field.setAccessible(true);
                sink = (NoOpPublisherNode) field.get(fluxtionProcessor);
                break;
            }
        }
        if (sink == null) {
            throw new IllegalStateException("Sink not found in " + fluxtionProcessor.getClass().getName());
        }
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        reuseEvent.setBid(100.0 + seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(reuseEvent);
        long elapsed = System.nanoTime() - t;
        histFx.recordValue(Math.min(elapsed, BenchmarkResultsWriter.HIGHEST_TRACKABLE));
        bh.consume(sink.getValue());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
    }
}