package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import com.telamin.fluxtion.test.performance.generators.HotPathGraphGenerator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: hot_path
 *
 * Fan-out graph with N branches. Only branch 0 (hot) ever fires; all cold
 * branches are silenced by a FilteringNode with an impossibly high threshold.
 * Measures selective sub-graph propagation overhead as branch count grows.
 *
 * Fluxtion evaluates one boolean guard per cold branch then short-circuits.
 * RxJava must traverse all subscriber lists and create operator contexts
 * for each branch on every event regardless of whether the filter passes.
 *
 * @Param size = number of branches (fan-out factor).
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class HotPathBenchmark extends DimensionBenchmarkBase {

    private static final String DIM = "hot_path";
    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/hot_path.yaml");

    @Param({"2", "4", "8", "16", "32"})
    public int size;

    private DataFlow fluxtionProcessor;
    private long seq = 0;

    private PublishProcessor<MarketDataEvent> rxRoot;
    private AtomicLong rxResult;

    @Setup
    public void setup() throws Exception {
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(
                new HotPathGraphGenerator(), CONFIG, size);

        // --- RxJava: one hot branch (always passes filter) + (size-1) cold branches ---
        rxRoot = PublishProcessor.create();
        // Hot branch: chain of 10 map stages
        Flowable<Double> hotChain = rxRoot.map(MarketDataEvent::getMid);
        for (int d = 0; d < 10; d++) hotChain = hotChain.map(v -> v + 1.0);
        rxResult = new AtomicLong();
        hotChain.subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));

        // Cold branches: threshold 1e15 — no mid price will ever cross this
        for (int b = 1; b < size; b++) {
            Flowable<Double> coldChain = rxRoot
                    .map(MarketDataEvent::getMid)
                    .filter(v -> v > 1.0e15);   // never passes
            for (int d = 0; d < 5; d++) coldChain = coldChain.map(v -> v + 1.0);
            coldChain.subscribe(v -> {});
        }
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(new MarketDataEvent("BTC", 100.0 + seq, 101.0 + seq, seq++));
        long elapsed = System.nanoTime() - t;
        recordFluxtion(DIM, size, elapsed);
        bh.consume(elapsed);
    }

    @Benchmark
    public void rxJava(Blackhole bh) {
        long t = System.nanoTime();
        rxRoot.onNext(new MarketDataEvent("BTC", 100.0 + seq, 101.0 + seq, seq++));
        long elapsed = System.nanoTime() - t;
        recordRxJava(DIM, size, elapsed);
        bh.consume(rxResult.get());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
        BenchmarkResultsWriter.printSummary();
    }
}
