package com.telamin.fluxtion.test.performance.benchmark;
import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.DeepPathGraphGenerator;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.HdrHistogram.Histogram;
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
 * Zero-allocation design:
 *   The Fluxtion path pre-allocates one MarketDataEvent and mutates its fields
 *   in place on every iteration.  This is the correct way to measure the
 *   steady-state dispatch overhead: the event object is caller-owned and
 *   Fluxtion never allocates anything internally.
 *   The JMH GC profiler (-prof gc) should therefore report 0 B/op for Fluxtion.
 *   RxJava cannot re-use the object passed to onNext() because operators may
 *   capture references across thread boundaries; a new object is created per
 *   call, demonstrating the unavoidable allocation tax of reactive streams.
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
    // Pre-allocated, mutable event — re-used every iteration to achieve 0 B/op
    private final MarketDataEvent reuseEvent = new MarketDataEvent("BTC", 100.0, 101.0, 0);

    // Pre-computed HDR keys — avoids String allocation on every hot-path iteration
    private String fluxtionKey;
    private String rxJavaKey;

    private Histogram histFx, histRx;

    // RxJava
    private PublishProcessor<MarketDataEvent> rxRoot;
    private AtomicLong rxResult;

    @Setup
    public void setup() throws Exception {
        fluxtionKey = DIM + "/fluxtion/" + size;
        rxJavaKey   = DIM + "/rxjava/"   + size;
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

        histFx = BenchmarkResultsWriter.getHistogram(fluxtionKey);
        histRx = BenchmarkResultsWriter.getHistogram(rxJavaKey);
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        // Mutate fields in-place: no allocation on the hot path
        reuseEvent.setBid(100.0 + seq);
        reuseEvent.setAsk(101.0 + seq);
        reuseEvent.setSequenceNumber(seq++);
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
        rxRoot.onNext(new MarketDataEvent("BTC", 100.0 + seq, 101.0 + seq, seq++));
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
