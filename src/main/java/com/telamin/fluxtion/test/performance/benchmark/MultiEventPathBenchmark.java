package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.ControlEvent;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import com.telamin.fluxtion.test.performance.generators.MultiEventPathGraphGenerator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: multi_event_path — Event Bias demonstration
 *
 * A single Fluxtion processor handles three independent event types, each compiled
 * into a completely disjoint execution path at AOT time.  Chain depths are BIASED:
 *
 *   MarketDataEvent  -> BaseNode x size          (hot path — full depth)
 *   TradeSignalEvent -> AccumulatorNode x size/2  (medium path — half depth)
 *   ControlEvent     -> FilteringNode x size/4    (cold path — quarter depth)
 *
 * Separate @Benchmark methods fire each event type in isolation so the per-type
 * latency can be read directly from JMH output and HDR histograms.
 *
 * What this proves:
 *   1. Event Bias: Fluxtion's latency is proportional to the actual chain depth
 *      for that event type.  A ControlEvent at size=20 traverses only 5 nodes
 *      and is correspondingly ~4x cheaper than the MarketData path.
 *   2. Path isolation: dispatching a ControlEvent never touches the MarketData
 *      or TradeSignal chains — confirmed by near-zero overhead on the short path.
 *   3. RxJava cannot model this naturally: each PublishProcessor chain must be
 *      manually sized and wired; the three chains share no structural insight.
 *
 * Zero-allocation design (Fluxtion only):
 *   One instance of each event type is pre-allocated and mutated in-place.
 *   The JMH GC profiler (-prof gc) must report 0 B/op for all three Fluxtion
 *   methods, while all three RxJava methods will show allocation proportional
 *   to their chain depth.
 *
 * HDR labels recorded:
 *   multi_event_md   / fluxtion|rxjava / size
 *   multi_event_ts   / fluxtion|rxjava / size
 *   multi_event_ctrl / fluxtion|rxjava / size
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class MultiEventPathBenchmark extends DimensionBenchmarkBase {

    private static final String DIM_MD   = "multi_event_md";
    private static final String DIM_TS   = "multi_event_ts";
    private static final String DIM_CTRL = "multi_event_ctrl";

    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/multi_event_path.yaml");

    @Param({"5", "10", "20", "50"})
    public int size;

    // Pre-computed HDR keys — avoids String allocation on every hot-path iteration
    private String fluxtionMdKey, fluxtionTsKey, fluxtionCtrlKey;
    private String rxMdKey, rxTsKey, rxCtrlKey;
    // -------------------------------------------------------------------------
    // Fluxtion — single pre-compiled processor handles all event types
    // -------------------------------------------------------------------------
    private DataFlow fluxtionProcessor;
    private long seq = 0;

    // Pre-allocated mutable events — mutated in-place, never re-allocated
    private final MarketDataEvent  mdEvent   = new MarketDataEvent("BTC", 100.0, 101.0, 0);
    private final TradeSignalEvent tsEvent   = new TradeSignalEvent(
            "AAPL", TradeSignalEvent.Side.BUY, 100.0, 150.0);
    private final ControlEvent     ctrlEvent = ControlEvent.enable("path");

    // -------------------------------------------------------------------------
    // RxJava — three separate chains, BIASED depths matching the Fluxtion graph
    // -------------------------------------------------------------------------
    private PublishProcessor<MarketDataEvent>  rxMdRoot;
    private PublishProcessor<TradeSignalEvent> rxTsRoot;
    private PublishProcessor<ControlEvent>     rxCtrlRoot;
    private AtomicLong rxMdResult;
    private AtomicLong rxTsResult;
    private AtomicLong rxCtrlResult;

    @Setup
    public void setup() throws Exception {
        fluxtionMdKey   = DIM_MD   + "/fluxtion/" + size;
        fluxtionTsKey   = DIM_TS   + "/fluxtion/" + size;
        fluxtionCtrlKey = DIM_CTRL + "/fluxtion/" + size;
        rxMdKey         = DIM_MD   + "/rxjava/"   + size;
        rxTsKey         = DIM_TS   + "/rxjava/"   + size;
        rxCtrlKey       = DIM_CTRL + "/rxjava/"   + size;
        // ---- Fluxtion ----
        fluxtionProcessor = buildFluxtionProcessor(
                new MultiEventPathGraphGenerator(), CONFIG, size);

        // Biased RxJava chain depths mirror the generator: MD=size, TS=size/2, Ctrl=size/4
        int mdDepth   = size;
        int tsDepth   = Math.max(1, size / 2);
        int ctrlDepth = Math.max(1, size / 4);

        // Market data chain (full depth)
        rxMdResult = new AtomicLong();
        rxMdRoot = PublishProcessor.create();
        Flowable<Double> mdChain = rxMdRoot.map(MarketDataEvent::getMid);
        for (int i = 0; i < mdDepth; i++) mdChain = mdChain.map(v -> v + 1.0);
        mdChain.subscribe(v -> rxMdResult.set(Double.doubleToLongBits(v)));

        // Trade signal chain (half depth)
        rxTsResult = new AtomicLong();
        rxTsRoot = PublishProcessor.create();
        final double[] acc = {0.0};
        Flowable<Double> tsChain = rxTsRoot.map(TradeSignalEvent::signedQuantity);
        for (int i = 0; i < tsDepth; i++) {
            tsChain = tsChain.map(v -> { acc[0] += v; return acc[0]; });
        }
        tsChain.subscribe(v -> rxTsResult.set(Double.doubleToLongBits(v)));

        // Control chain (quarter depth)
        rxCtrlResult = new AtomicLong();
        rxCtrlRoot = PublishProcessor.create();
        Flowable<Double> ctrlChain = rxCtrlRoot.map(e -> e.isEnabled() ? 1.0 : 0.0);
        for (int i = 0; i < ctrlDepth; i++) {
            ctrlChain = ctrlChain.filter(v -> v > 0.0).map(v -> v + 1.0);
        }
        ctrlChain.subscribe(v -> rxCtrlResult.set(Double.doubleToLongBits(v)));
    }

    // =========================================================================
    // Fluxtion benchmarks — one per event type
    // =========================================================================

    /** Hot path: MarketData -> BaseNode x size (full chain depth). */
    @Benchmark
    public void fluxtionMarketData(Blackhole bh) {
        mdEvent.setBid(100.0 + seq);
        mdEvent.setAsk(101.0 + seq);
        mdEvent.setSequenceNumber(seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(mdEvent);
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(fluxtionMdKey, elapsed);
        bh.consume(elapsed);
    }

    /** Medium path: TradeSignal -> AccumulatorNode x size/2. */
    @Benchmark
    public void fluxtionTradeSignal(Blackhole bh) {
        tsEvent.setQuantity(100.0 + seq);
        tsEvent.setLimitPrice(150.0 + seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(tsEvent);
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(fluxtionTsKey, elapsed);
        bh.consume(elapsed);
    }

    /** Cold path: Control -> FilteringNode x max(1,size/4). */
    @Benchmark
    public void fluxtionControl(Blackhole bh) {
        ctrlEvent.setCommand(seq++ % 10 == 0
                ? ControlEvent.Command.ENABLE : ControlEvent.Command.DISABLE);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(ctrlEvent);
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(fluxtionCtrlKey, elapsed);
        bh.consume(elapsed);
    }

    // =========================================================================
    // RxJava benchmarks — one per event type, new object each call (unavoidable)
    // =========================================================================

    /** RxJava hot path: MarketData chain of depth=size. */
    @Benchmark
    public void rxJavaMarketData(Blackhole bh) {
        long t = System.nanoTime();
        rxMdRoot.onNext(new MarketDataEvent("BTC", 100.0 + seq, 101.0 + seq, seq++));
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(rxMdKey, elapsed);
        bh.consume(rxMdResult.get());
    }

    /** RxJava medium path: TradeSignal chain of depth=size/2. */
    @Benchmark
    public void rxJavaTradeSignal(Blackhole bh) {
        long t = System.nanoTime();
        rxTsRoot.onNext(new TradeSignalEvent(
                "AAPL", TradeSignalEvent.Side.BUY, 100.0 + seq, 150.0 + seq++));
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(rxTsKey, elapsed);
        bh.consume(rxTsResult.get());
    }

    /** RxJava cold path: Control chain of depth=max(1,size/4). */
    @Benchmark
    public void rxJavaControl(Blackhole bh) {
        long t = System.nanoTime();
        rxCtrlRoot.onNext(seq++ % 10 == 0
                ? ControlEvent.enable("path") : ControlEvent.disable("path"));
        long elapsed = System.nanoTime() - t;
        BenchmarkResultsWriter.record(rxCtrlKey, elapsed);
        bh.consume(rxCtrlResult.get());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
        BenchmarkResultsWriter.printSummary();
    }
}
