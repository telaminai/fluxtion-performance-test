package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.DeepPathGraphGenerator;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: deep_path
 *
 * Measures raw latency scaling with chain depth.
 * Fluxtion compiles a flat linear sequence of guarded calls; RxJava traverses
 * a dynamic operator chain with allocation at each onNext().
 *
 * @Param size sweeps the sizes declared in deep_path.yaml.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class DeepPathBenchmark extends DimensionBenchmarkBase {

    private static final String DIM = "deep_path";
    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/deep_path.yaml");

    @Param({"5", "10", "20", "50", "100"})
    public int size;

    // Fluxtion
    private DataFlow fluxtionProcessor;
    private long seq = 0;

    // RxJava
    private PublishProcessor<MarketDataEvent> rxRoot;
    private AtomicLong rxResult;

    @Setup
    public void setup() throws Exception {
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(
                new DeepPathGraphGenerator(), CONFIG, size);

        // --- RxJava: linear chain of size+1 map stages ---
        rxRoot = PublishProcessor.create();
        Flowable<Double> chain = rxRoot.map(MarketDataEvent::getMid);
        for (int i = 0; i < size; i++) {
            chain = chain.map(v -> v + 1.0);
        }
        rxResult = new AtomicLong();
        chain.subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));
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
