package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import com.telamin.fluxtion.test.performance.generators.IntermediateHandlersGraphGenerator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: intermediate_handlers
 *
 * Linear chain where a new @OnEventHandler is inserted every 5 nodes,
 * creating multiple independent event entry points in the same graph.
 *
 * Fluxtion infers a merged execution path covering all entry points and
 * deduplicates shared downstream nodes at compile time.
 * RxJava must merge multiple PublishProcessors with Flowable.merge(), each
 * independently traversing their downstream chains — the number of traversals
 * scales with the number of intermediate handlers.
 *
 * @Param size = total chain length (excluding sink).
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class IntermediateHandlersBenchmark extends DimensionBenchmarkBase {

    private static final String DIM = "intermediate_handlers";
    private static final int    HANDLER_EVERY_N = 5;
    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/intermediate_handlers.yaml");

    @Param({"10", "20", "50", "100"})
    public int size;

    private DataFlow fluxtionProcessor;
    private long seq = 0;

    // RxJava: one PublishProcessor per handler (root + one per handlerEveryN interval)
    private List<PublishProcessor<TradeSignalEvent>> rxHandlers;
    private AtomicLong rxResult;

    @Setup
    public void setup() throws Exception {
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(
                new IntermediateHandlersGraphGenerator(), CONFIG, size);

        // --- RxJava: one processor per entry point, merged and chained ---
        rxHandlers = new ArrayList<>();
        int handlerCount = 1 + (size / HANDLER_EVERY_N);
        List<Flowable<Double>> branches = new ArrayList<>();

        for (int h = 0; h < handlerCount; h++) {
            PublishProcessor<TradeSignalEvent> proc = PublishProcessor.create();
            rxHandlers.add(proc);
            // Each handler feeds a short chain representing the nodes it owns
            Flowable<Double> branch = proc.map(TradeSignalEvent::signedQuantity);
            int nodesInSegment = (h < handlerCount - 1)
                    ? HANDLER_EVERY_N - 1
                    : size - (handlerCount - 1) * HANDLER_EVERY_N;
            for (int d = 0; d < Math.max(0, nodesInSegment); d++) {
                branch = branch.map(v -> v + 1.0);
            }
            branches.add(branch);
        }

        rxResult = new AtomicLong();
        Flowable.merge(branches)
                .subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));
    }

    @Benchmark
    public void fluxtion(Blackhole bh) {
        TradeSignalEvent event = new TradeSignalEvent(
                "MSFT", TradeSignalEvent.Side.SELL, 50.0 + seq, 200.0 + seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(event);
        long elapsed = System.nanoTime() - t;
        recordFluxtion(DIM, size, elapsed);
        bh.consume(elapsed);
    }

    @Benchmark
    public void rxJava(Blackhole bh) {
        TradeSignalEvent event = new TradeSignalEvent(
                "MSFT", TradeSignalEvent.Side.SELL, 50.0 + seq, 200.0 + seq++);
        long t = System.nanoTime();
        // Publish to all handlers — mirrors Fluxtion delivering event to all entry points
        for (PublishProcessor<TradeSignalEvent> proc : rxHandlers) {
            proc.onNext(event);
        }
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
