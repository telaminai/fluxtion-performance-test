package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import com.telamin.fluxtion.test.performance.generators.PolymorphicGraphGenerator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.HdrHistogram.Histogram;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: polymorphic
 *
 * Chain where nodes alternate between BaseNode, AccumulatorNode, TransformNode.
 * Fluxtion generates a monomorphic call-site per node; the JIT inlines fully.
 * In RxJava each operator lambda is a distinct type, but the subscriber chain
 * dispatch itself remains polymorphic — as distinct subtypes accumulate the
 * JVM degrades from bimorphic to megamorphic dispatch.
 *
 * @Param size = total intermediate nodes.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class PolymorphicBenchmark extends DimensionBenchmarkBase {

    private static final String DIM = "polymorphic";
    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/polymorphic.yaml");

    @Param({"5", "10", "20", "50", "100"})
    public int size;

    private DataFlow fluxtionProcessor;
    private long seq = 0;
    // Pre-allocated, mutable event — re-used every iteration to achieve 0 B/op
    private final TradeSignalEvent reuseEvent =
            new TradeSignalEvent("AAPL", TradeSignalEvent.Side.BUY, 100.0, 150.0);
    // Pre-computed HDR keys — avoids String allocation on every hot-path iteration
    private String fluxtionKey;
    private String rxJavaKey;
    private PublishProcessor<TradeSignalEvent> rxRoot;
    private AtomicLong rxResult;

    private Histogram histFx, histRx;

    // Cycle mirrors the three node subtypes: sum, accumulate, multiply
    private static final double FACTOR = 1.001;

    @Setup
    public void setup() throws Exception {
        fluxtionKey = DIM + "/fluxtion/" + size;
        rxJavaKey   = DIM + "/rxjava/"   + size;
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(
                new PolymorphicGraphGenerator(), CONFIG, size);

        // --- RxJava: mirror the three-subtype cycle with distinct lambda types ---
        rxRoot = PublishProcessor.create();
        Flowable<Double> chain = rxRoot.map(TradeSignalEvent::signedQuantity);
        for (int i = 0; i < size; i++) {
            int mod = i % 3;
            if (mod == 0) {
                chain = chain.map(v -> v + 1.0);           // BaseNode equivalent
            } else if (mod == 1) {
                final double[] acc = {0.0};
                chain = chain.map(v -> { acc[0] += v; return acc[0]; }); // AccumulatorNode
            } else {
                chain = chain.map(v -> v * FACTOR);        // TransformNode
            }
        }
        rxResult = new AtomicLong();
        chain.subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));

        histFx = BenchmarkResultsWriter.getHistogram(fluxtionKey);
        histRx = BenchmarkResultsWriter.getHistogram(rxJavaKey);
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        // Mutate fields in-place: no allocation on the hot path
        reuseEvent.setQuantity(100.0 + seq);
        reuseEvent.setLimitPrice(150.0 + seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(reuseEvent);
        long elapsed = System.nanoTime() - t;
        histFx.recordValue(Math.min(elapsed, BenchmarkResultsWriter.HIGHEST_TRACKABLE));
        bh.consume(elapsed);
    }
    @Benchmark
    public void rxJava(Blackhole bh) {
        // RxJava: new object required — operators may capture references
        long t = System.nanoTime();
        rxRoot.onNext(new TradeSignalEvent(
                "AAPL", TradeSignalEvent.Side.BUY, 100.0 + seq, 150.0 + seq++));
        long elapsed = System.nanoTime() - t;
        histRx.recordValue(Math.min(elapsed, BenchmarkResultsWriter.HIGHEST_TRACKABLE));
        bh.consume(rxResult.get());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
        BenchmarkResultsWriter.printSummary();
    }
}
