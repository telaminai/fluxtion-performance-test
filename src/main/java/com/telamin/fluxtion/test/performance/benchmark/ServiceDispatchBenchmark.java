package com.telamin.fluxtion.test.performance.benchmark;

import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.test.performance.events.ShortChainEvent;
import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;
import com.telamin.fluxtion.test.performance.generators.ShortChainGraphGenerator;
import com.telamin.fluxtion.test.performance.service.IShortChainProcessor;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Dimension: short_chain — @ExportService typed dispatch vs standard onEvent vs RxJava
 *
 * <h2>What is being measured</h2>
 * Three dispatch paths for an identical linear computation chain:
 *
 * <ol>
 *   <li><b>fluxtionOnEvent</b> — {@code processor.onEvent(event)}<br>
 *       The standard Fluxtion entry point.  The generated processor calls
 *       {@code onEventInternal(Object)} which first does an {@code instanceof}
 *       check to identify the event type, then delegates to the typed handler.
 *       For a short chain the instanceof lookup is a non-trivial fraction of
 *       total execution time.</li>
 *
 *   <li><b>fluxtionService</b> — {@code ((IShortChainProcessor) processor).processChain(event)}<br>
 *       The {@code @ExportService} path.  The generated processor class
 *       implements {@code IShortChainProcessor} directly; calling
 *       {@code processChain()} skips {@code onEventInternal} and
 *       {@code instanceof} entirely, going straight into the inlined chain.
 *       This is most advantageous for very short chains where dispatch overhead
 *       is a significant fraction of total work.</li>
 *
 *   <li><b>rxJava</b> — RxJava {@code PublishSubject} + Observable map chain<br>
 *       Each {@code onNext()} allocates wrappers, traverses a dynamic operator
 *       chain, and incurs GC pressure.  Baseline showing the reactive tax.</li>
 * </ol>
 *
 * <h2>Zero-allocation design</h2>
 * Both Fluxtion paths pre-allocate a single {@link ShortChainEvent} and mutate
 * its fields in-place on every iteration — {@code 0 B/op} in steady state.
 * The RxJava path creates a new event per call (operators may capture references;
 * in-place mutation is unsafe across async boundaries).
 *
 * <h2>Expected results</h2>
 * <pre>
 *   fluxtionService  &lt; fluxtionOnEvent  &lt;&lt; rxJava
 * </pre>
 * The service advantage shrinks as chain length grows (dispatch overhead becomes
 * a smaller fraction of total work), which is why sizes 3–10 are most revealing.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class ServiceDispatchBenchmark extends DimensionBenchmarkBase {

    private static final String DIM_ONEVENT = "short_chain_onEvent";
    private static final String DIM_SERVICE = "short_chain_service";
    private static final BenchmarkConfig CONFIG =
            GraphGeneratorBase.loadConfig("benchmark-configs/short_chain.yaml");

    @Param({"3", "5", "10"})
    public int size;

    // --- Fluxtion shared processor (implements both DataFlow and IShortChainProcessor) ---
    private DataFlow             fluxtionProcessor;
    private IShortChainProcessor serviceProcessor;

    /** Pre-allocated, mutable — re-used every iteration: 0 B/op for both Fluxtion paths. */
    private final ShortChainEvent reuseEvent = new ShortChainEvent(1.0, 0L);
    private long seq = 0;

    // --- RxJava ---
    private PublishSubject<Double> rxRoot;
    private AtomicLong             rxResult;

    @Setup
    public void setup() throws Exception {
        // --- Fluxtion ---
        fluxtionProcessor = buildFluxtionProcessor(new ShortChainGraphGenerator(), CONFIG, size);
        // The generated processor implements @ExportService IShortChainProcessor — safe cast
        serviceProcessor = (IShortChainProcessor) fluxtionProcessor;

        // --- RxJava: linear chain of (size + 1) map stages ---
        rxRoot = PublishSubject.create();
        Observable<Double> chain = rxRoot.map(v -> v);
        for (int i = 0; i < size; i++) {
            chain = chain.map(v -> v + 1.0);
        }
        rxResult = new AtomicLong();
        chain.subscribe(v -> rxResult.set(Double.doubleToLongBits(v)));
    }

    /**
     * Standard Fluxtion dispatch: {@code processor.onEvent(event)}.
     * Goes through {@code onEventInternal(Object)} and an instanceof check before
     * reaching the compiled chain.
     */
    @Benchmark
    public void fluxtionOnEvent(Blackhole bh) {
        reuseEvent.update(100.0 + seq, seq++);
        long t = System.nanoTime();
        fluxtionProcessor.onEvent(reuseEvent);
        long elapsed = System.nanoTime() - t;
        recordFluxtion(DIM_ONEVENT, size, elapsed);
        bh.consume(elapsed);
    }

    /**
     * @ExportService dispatch: {@code ((IShortChainProcessor) processor).processChain(event)}.
     * Calls the strongly-typed generated method directly — no instanceof overhead.
     * Expected to be measurably faster than fluxtionOnEvent for sizes 3–10.
     */
    @Benchmark
    public void fluxtionService(Blackhole bh) {
        reuseEvent.update(100.0 + seq, seq++);
        long t = System.nanoTime();
        serviceProcessor.processChain(reuseEvent);
        long elapsed = System.nanoTime() - t;
        recordFluxtion(DIM_SERVICE, size, elapsed);
        bh.consume(elapsed);
    }

    /**
     * RxJava reactive chain baseline.
     * Each call allocates a new Double wrapper per map stage and traverses a
     * dynamic operator chain — demonstrating the reactive dispatch tax.
     */
    @Benchmark
    public void rxJava(Blackhole bh) {
        long t = System.nanoTime();
        rxRoot.onNext(100.0 + seq++);
        long elapsed = System.nanoTime() - t;
        recordRxJava(DIM_SERVICE, size, elapsed);
        bh.consume(rxResult.get());
    }

    @TearDown
    public void tearDown() {
        BenchmarkResultsWriter.writeAll("target/results");
        BenchmarkResultsWriter.printSummary();
    }
}
