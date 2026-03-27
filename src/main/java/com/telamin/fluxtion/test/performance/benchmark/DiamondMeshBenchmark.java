package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.HdrHistogram.Histogram;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

/**
 * Dimension: diamond_mesh
 *
 * A complex graph where nodes have multiple upstreams forming a diamond topology.
 * Tests Fluxtion's AOT-compiled execution schedule vs. RxJava's zip/share overhead.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class DiamondMeshBenchmark extends DimensionBenchmarkBase {
    private static final String DIM = "diamond_mesh";

    @Param({"101"})
    public int size;

    private DataFlow fluxtionProcessor;
    private PublishProcessor<MarketDataEvent> rxJavaInput;
    private Flowable<Double> rxJavaResult;

    private final MarketDataEvent reuseEvent = new MarketDataEvent("BTC", 100.0, 101.0, 0);
    private Histogram histFx;
    private Histogram histRx;

    @Setup
    public void setup() throws Exception {
        String fluxtionKey = DIM + "/fluxtion/" + size;
        String rxJavaKey = DIM + "/rxjava/" + size;

        fluxtionProcessor = buildFluxtionProcessor(DIM, size);

        rxJavaInput = PublishProcessor.create();
        rxJavaResult = buildRxJavaGraph(size);
        rxJavaResult.subscribe(v -> {}); // dummy sub to keep it alive

        histFx = BenchmarkResultsWriter.getHistogram(fluxtionKey);
        histRx = BenchmarkResultsWriter.getHistogram(rxJavaKey);
    }

    private Flowable<Double> buildRxJavaGraph(int size) {
        // Simple linear chain for DiamondMesh comparison (not exact, but consistent with original benchmark)
        // Original benchmark for RxJava in DiamondMesh used a shared+zipped chain.
        Flowable<Double> source = rxJavaInput.map(MarketDataEvent::getMid).share();
        Flowable<Double> current = source;
        for (int i = 0; i < size; i++) {
            current = Flowable.zip(current, source, (a, b) -> a + b + 1.0);
        }
        return current;
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(reuseEvent);
        long elapsed = System.nanoTime() - t;
        histFx.recordValue(Math.min(elapsed, BenchmarkResultsWriter.HIGHEST_TRACKABLE));
        bh.consume(elapsed);
    }

    @Benchmark
    public void rxJava(Blackhole bh) {
        long t = System.nanoTime();
        rxJavaInput.onNext(reuseEvent);
        long elapsed = System.nanoTime() - t;
        histRx.recordValue(Math.min(elapsed, BenchmarkResultsWriter.HIGHEST_TRACKABLE));
        bh.consume(elapsed);
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
    }
}