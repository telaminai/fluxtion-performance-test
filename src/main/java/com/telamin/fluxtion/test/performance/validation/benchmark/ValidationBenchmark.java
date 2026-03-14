package com.telamin.fluxtion.test.performance.validation.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent;
import com.telamin.fluxtion.test.performance.validation.nodes.DataCollector;
import com.telamin.fluxtion.test.performance.validation.nodes.EventContext;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationNodeBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * JMH benchmark comparing Fluxtion AOT-compiled validation processors vs equivalent
 * RxJava 3 diamond graphs under identical workloads.
 *
 * <h3>What is measured</h3>
 * <ul>
 *   <li>{@link #fluxtionMarket} / {@link #rxJavaMarket} — full market-data chain
 *       (depth=size layers × 3 nodes/layer), all nodes active.</li>
 *   <li>{@link #fluxtionTrade} / {@link #rxJavaTrade} — trade-signal chain (depth=size/2).</li>
 *   <li>{@link #fluxtionControl} / {@link #rxJavaControl} — control chain (depth=max(2,size/3)).</li>
 * </ul>
 *
 * <h3>Key differences from other benchmarks</h3>
 * <ul>
 *   <li>Events carry an {@code activeIds} set — every node checks propagation eligibility
 *       per cycle. This exercises Fluxtion's compiled boolean guards vs RxJava's filter() chains.</li>
 *   <li>Three independent chains in one processor — proves Fluxtion dispatches each event type
 *       to an isolated generated path without instanceof overhead.</li>
 *   <li>DataCollector is disabled (reset-only) during benchmarking to eliminate List.add()
 *       overhead from latency measurements; only event propagation is timed.</li>
 * </ul>
 *
 * <h3>Memory behaviour</h3>
 * Fluxtion: pre-allocated mutable events (0 B/op in steady state).
 * RxJava:   allocates wrapper objects and lambda captures per cycle.
 *
 * Run with: mvn exec:java -Dexec.mainClass=org.openjdk.jmh.Main
 *            -Dexec.args="ValidationBenchmark -f 0 -wi 3 -i 3 -prof gc"
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 1)
@Fork(0)
public class ValidationBenchmark {

    @Param({"3", "5", "10"})
    public int size;

    // --- Fluxtion ---
    private DataFlow fluxtionProcessor;
    private DataCollector fluxtionDc;
    private ValidationMarketEvent reuseMarket;
    private ValidationTradeEvent  reuseTrade;
    private ValidationControlEvent reuseControl;

    // All-active ID sets per chain (computed once in setup)
    private Set<String> allMdIds;
    private Set<String> allTsIds;
    private Set<String> allCtrlIds;

    // --- RxJava ---
    private PublishSubject<Double> rxMdRoot;
    private PublishSubject<Double> rxTsRoot;
    private PublishSubject<Double> rxCtrlRoot;
    private DataCollector rxDc;

    // Blackhole sink for RxJava results
    private volatile long rxSink;

    @Setup
    public void setup() throws Exception {
        buildAllIds();
        setupFluxtion();
        setupRxJava();
    }

    // =========================================================================
    // Fluxtion benchmarks
    // =========================================================================

    @Benchmark
    public void fluxtionMarket(Blackhole bh) {
        fluxtionDc.reset();
        fluxtionProcessor.onEvent(reuseMarket);
        bh.consume(fluxtionDc.getFiredNodes().size());
    }

    @Benchmark
    public void fluxtionTrade(Blackhole bh) {
        fluxtionDc.reset();
        fluxtionProcessor.onEvent(reuseTrade);
        bh.consume(fluxtionDc.getFiredNodes().size());
    }

    @Benchmark
    public void fluxtionControl(Blackhole bh) {
        fluxtionDc.reset();
        fluxtionProcessor.onEvent(reuseControl);
        bh.consume(fluxtionDc.getFiredNodes().size());
    }

    // =========================================================================
    // RxJava benchmarks
    // =========================================================================

    @Benchmark
    public void rxJavaMarket(Blackhole bh) {
        rxDc.reset();
        rxMdRoot.onNext(50000.0);
        bh.consume(rxSink);
    }

    @Benchmark
    public void rxJavaTrade(Blackhole bh) {
        rxDc.reset();
        rxTsRoot.onNext(100.0);
        bh.consume(rxSink);
    }

    @Benchmark
    public void rxJavaControl(Blackhole bh) {
        rxDc.reset();
        rxCtrlRoot.onNext(0.5);
        bh.consume(rxSink);
    }

    // =========================================================================
    // Setup helpers
    // =========================================================================

    private void buildAllIds() {
        int mdLayers   = Math.max(2, size);
        int tsLayers   = Math.max(2, size / 2);
        int ctrlLayers = Math.max(2, size / 3);

        allMdIds   = buildChainIds("md",   mdLayers,   3);
        allTsIds   = buildChainIds("ts",   tsLayers,   3);
        allCtrlIds = buildChainIds("ctrl", ctrlLayers, 3);
    }

    private static Set<String> buildChainIds(String prefix, int layers, int npl) {
        Set<String> ids = new HashSet<>();
        ids.add(prefix + "_root");
        for (int l = 1; l <= layers; l++)
            for (int n = 0; n < npl; n++)
                ids.add(prefix + "_l" + l + "_n" + n);
        ids.add(prefix + "_sink");
        return Collections.unmodifiableSet(ids);
    }

    private void setupFluxtion() throws Exception {
        String className = "com.telamin.fluxtion.test.performance.validation.generated.ValidationDiamond"
                + size + "Processor";
        Class<?> cls = Class.forName(className);
        fluxtionProcessor = (DataFlow) cls.getDeclaredConstructor().newInstance();
        fluxtionProcessor.init();

        Field dcField = cls.getDeclaredField("dataCollector");
        dcField.setAccessible(true);
        fluxtionDc = (DataCollector) dcField.get(fluxtionProcessor);

        Field ecField = cls.getDeclaredField("eventContext");
        ecField.setAccessible(true);
        EventContext ec = (EventContext) ecField.get(fluxtionProcessor);

        // Wire dataCollector + eventContext into all ValidationNodeBase instances
        for (Field f : cls.getDeclaredFields()) {
            f.setAccessible(true);
            Object val = f.get(fluxtionProcessor);
            if (val instanceof ValidationNodeBase) {
                ValidationNodeBase node = (ValidationNodeBase) val;
                node.setDataCollector(fluxtionDc);
                node.setEventContext(ec);
            }
        }

        // Pre-allocate mutable events with all IDs active (zero allocation in benchmark loop)
        reuseMarket  = new ValidationMarketEvent(allMdIds,   1L, "BTCUSD", 50000.0, 50001.0);
        reuseTrade   = new ValidationTradeEvent(allTsIds,   1L, "BTCUSD",
                ValidationTradeEvent.Side.BUY, 1.0, 50000.0);
        reuseControl = new ValidationControlEvent(allCtrlIds, 1L, "all",
                ValidationControlEvent.Command.ENABLE, 0.0);
    }

    private void setupRxJava() {
        rxDc = new DataCollector();
        int mdLayers   = Math.max(2, size);
        int tsLayers   = Math.max(2, size / 2);
        int ctrlLayers = Math.max(2, size / 3);

        rxMdRoot   = buildRxChain("md",   mdLayers,   3, rxDc);
        rxTsRoot   = buildRxChain("ts",   tsLayers,   3, rxDc);
        rxCtrlRoot = buildRxChain("ctrl", ctrlLayers, 3, rxDc);
    }

    /**
     * Builds a layered RxJava diamond chain using share()+zip() for correctness.
     * Returns the root PublishSubject to emit events into.
     */
    private PublishSubject<Double> buildRxChain(String prefix, int layers, int npl,
                                                DataCollector dc) {
        PublishSubject<Double> root = PublishSubject.create();
        Observable<Double> sharedRoot = root
                .doOnNext(v -> dc.record(prefix + "_root"))
                .share();

        // Build each layer
        Observable<Double>[] prev = new Observable[npl];
        for (int n = 0; n < npl; n++) {
            final String id = prefix + "_l1_n" + n;
            prev[n] = sharedRoot
                    .map(v -> v + 1.0)
                    .doOnNext(v -> dc.record(id))
                    .share();
        }

        for (int l = 2; l <= layers; l++) {
            Observable<Double>[] curr = new Observable[npl];
            for (int n = 0; n < npl; n++) {
                final String id = prefix + "_l" + l + "_n" + n;
                Observable<Double> up1 = prev[n % npl];
                Observable<Double> up2 = prev[(n + 1) % npl];
                curr[n] = Observable.zip(up1, up2, (a, b) -> a + b + 1.0)
                        .doOnNext(v -> dc.record(id))
                        .share();
            }
            prev = curr;
        }

        // Sink
        final Observable<Double>[] lastLayer = prev;
        lastLayer[0]
                .doOnNext(v -> { dc.record(prefix + "_sink"); rxSink = v.longValue(); })
                .subscribe();

        return root;
    }
}
