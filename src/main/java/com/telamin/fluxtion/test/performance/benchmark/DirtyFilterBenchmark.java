package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.ControlEvent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.HdrHistogram.Histogram;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: dirty_filter
 *
 * Mixed chain with FilteringNodes inserted every 3rd position.
 * Two event streams alternate:
 *   - ENABLE events (10%): ControlRootNode returns true — full graph executes.
 *   - DISABLE events (90%): ControlRootNode returns false — entire graph is arrested
 *     at the root guard check. Fluxtion pays ~1 boolean check; RxJava still
 *     traverses the full subscriber list before each filter() discards.
 *
 * @Param size = total intermediate nodes.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class DirtyFilterBenchmark extends DimensionBenchmarkBase {

    private static final String DIM = "dirty_filter";

    @Param({"10", "20", "50", "100"})
    public int size;

    private DataFlow fluxtionProcessor;
    private long eventCount = 0;
    // Pre-computed HDR keys — avoids String allocation on every hot-path iteration
    private String fluxtionKey;
    private String rxJavaKey;
    private PublishProcessor<ControlEvent> rxRoot;
    private AtomicLong rxResult;

    private Histogram histFx, histRx;

    // Pre-built events: 1 ENABLE followed by 9 DISABLE — 10% pass rate
    private final ControlEvent ENABLE_EVENT  = ControlEvent.enable("path");
    private final ControlEvent DISABLE_EVENT = ControlEvent.disable("path");

    @Setup
    public void setup() throws Exception {
        fluxtionKey = DIM + "/fluxtion/" + size;
        rxJavaKey   = DIM + "/rxjava/"   + size;
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(DIM, size);

        // --- RxJava: chain with filter() every 3rd stage, threshold=0.5 ---
        rxRoot = PublishProcessor.create();
        // Map command to a double: ENABLE -> 1.0, DISABLE -> 0.0
        Flowable<Double> chain = rxRoot.map(e -> e.isEnabled() ? 1.0 : 0.0);
        for (int i = 1; i <= size; i++) {
            if (i % 3 == 0) {
                chain = chain.filter(v -> v > 0.5).map(v -> v);  // FilteringNode equivalent
            } else {
                chain = chain.map(v -> v + 1.0);                  // BaseNode equivalent
            }
        }
        rxResult = new AtomicLong();
        chain.subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));

        histFx = BenchmarkResultsWriter.getHistogram(fluxtionKey);
        histRx = BenchmarkResultsWriter.getHistogram(rxJavaKey);
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        // 90% DISABLE, 10% ENABLE
        ControlEvent event = (eventCount % 10 == 0) ? ENABLE_EVENT : DISABLE_EVENT;
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(event);
        long elapsed = System.nanoTime() - t;
        eventCount++;
        histFx.recordValue(Math.min(elapsed, 10_000_000_000L));
        bh.consume(elapsed);
    }

    @Benchmark
    public void rxJava(Blackhole bh) {
        ControlEvent event = (eventCount % 10 == 0) ? ENABLE_EVENT : DISABLE_EVENT;
        long t = System.nanoTime();
        rxRoot.onNext(event);
        long elapsed = System.nanoTime() - t;
        eventCount++;
        histRx.recordValue(Math.min(elapsed, 10_000_000_000L));
        bh.consume(rxResult.get());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
        BenchmarkResultsWriter.printSummary();
    }
}
