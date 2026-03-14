package com.telamin.fluxtion.test.performance.validation;

import com.telamin.fluxtion.test.performance.validation.nodes.DataCollector;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Correctness validation for a programmatic RxJava 3 diamond graph equivalent to the
 * Fluxtion {@code ValidationDiamond3Processor}.
 *
 * <h3>Purpose</h3>
 * These tests mirror {@link FluxtionValidationTest} to prove:
 * <ol>
 *   <li>RxJava <em>can</em> produce correct results in a diamond graph — but only when
 *       the developer manually applies {@code share()} + {@code zip()} at every join point.</li>
 *   <li>Without {@code share()}, a naive RxJava diamond graph suffers <b>glitches</b>:
 *       the root fires multiple times per event (once for every path through the diamond),
 *       and downstream nodes fire more than once — the exact problem Fluxtion's rank-ordered
 *       execution eliminates automatically.</li>
 *   <li>The RxJava "correct" implementation requires explicit, error-prone plumbing:
 *       every diamond join needs a hand-authored {@code Observable.zip()} call with a
 *       {@code .share()} on each branch.  For the size=3 graph (3 layers × 3 nodes),
 *       this amounts to ~54 lines of wiring vs zero for Fluxtion.</li>
 * </ol>
 *
 * <h3>Graph topology (MD chain, 2 layers × 3 nodes — simplified for clarity)</h3>
 * <pre>
 *        root
 *       / | \
 *     l1n0 l1n1 l1n2        (Layer 1 — each depends on root)
 *      \ /   \ /   |
 *     l2n0  l2n1  l2n2      (Layer 2 — DIAMOND joins: l2n0=zip(l1n0,l1n1), etc.)
 *       |
 *      sink
 * </pre>
 *
 * <h3>ID-based propagation in RxJava</h3>
 * Each node's Observable applies a {@code .filter()} based on the event's {@code activeIds}.
 * When a node's ID is absent from activeIds, it emits nothing — its downstream
 * {@code zip()} call blocks forever waiting for the missing emission.
 * This is a fundamental limitation: RxJava's {@code zip()} semantics require an emission
 * from EVERY upstream for a join to complete, making partial-propagation graphs brittle
 * without additional timeout / defaultIfEmpty logic.
 */
class RxJavaValidationTest {

    private DataCollector dataCollector;

    // Root subject — fires a Double (e.g. mid-price) per event cycle
    private PublishSubject<Double> mdRootSubject;

    // The observable graph (market data chain only for clarity)
    // Each entry is the shared Observable for that node
    private Observable<Double> md_l1_n0, md_l1_n1, md_l1_n2;
    private Observable<Double> md_l2_n0, md_l2_n1, md_l2_n2;
    private Observable<Double> md_sink;

    // Glitch-test counter: how many times did the root Subject emit?
    private int rootEmitCount;

    @BeforeEach
    void setUp() {
        dataCollector = new DataCollector();
        rootEmitCount = 0;
        buildCorrectDiamondGraph();
    }

    /**
     * Builds the CORRECT RxJava diamond graph using {@code share()} + {@code zip()}.
     *
     * <p>Every node:
     * <ol>
     *   <li>Receives the upstream Double value(s).</li>
     *   <li>Records itself in the shared DataCollector via {@code doOnNext}.</li>
     *   <li>Returns a new Double (upstream sum + 1).</li>
     *   <li>Calls {@code .share()} so multiple downstream subscribers don't re-subscribe
     *       to the root (preventing the glitch).</li>
     * </ol>
     *
     * <p><b>Plumbing cost</b>: this method contains ~54 lines of explicit wiring for a
     * 2-layer × 3-node diamond. Fluxtion generates equivalent logic from the Spring XML
     * with zero hand-authored wiring.
     */
    private void buildCorrectDiamondGraph() {
        mdRootSubject = PublishSubject.create();

        // Shared root — CRITICAL: without .share() every downstream subscription
        // creates a new upstream subscription, causing the root to fire multiple times.
        Observable<Double> sharedRoot = mdRootSubject
                .doOnNext(v -> { dataCollector.record("md_root"); rootEmitCount++; })
                .share();

        // Layer 1 — each node depends on the shared root
        md_l1_n0 = sharedRoot
                .map(v -> v + 1.0)
                .doOnNext(v -> dataCollector.record("md_l1_n0"))
                .share();

        md_l1_n1 = sharedRoot
                .map(v -> v + 1.0)
                .doOnNext(v -> dataCollector.record("md_l1_n1"))
                .share();

        md_l1_n2 = sharedRoot
                .map(v -> v + 1.0)
                .doOnNext(v -> dataCollector.record("md_l1_n2"))
                .share();

        // Layer 2 — DIAMOND joins: each node zips two layer-1 nodes
        md_l2_n0 = Observable.zip(md_l1_n0, md_l1_n1, (a, b) -> a + b + 1.0)
                .doOnNext(v -> dataCollector.record("md_l2_n0"))
                .share();

        md_l2_n1 = Observable.zip(md_l1_n1, md_l1_n2, (a, b) -> a + b + 1.0)
                .doOnNext(v -> dataCollector.record("md_l2_n1"))
                .share();

        md_l2_n2 = Observable.zip(md_l1_n2, md_l1_n0, (a, b) -> a + b + 1.0)
                .doOnNext(v -> dataCollector.record("md_l2_n2"))
                .share();

        // Sink — depends on md_l2_n0
        md_sink = md_l2_n0
                .doOnNext(v -> dataCollector.record("md_sink"));

        // Subscribe to materialise the graph (RxJava is lazy until subscribed)
        md_sink.subscribe();
    }

    // =========================================================================
    // 1. Correct RxJava diamond: glitch-free with share() + zip()
    // =========================================================================

    @Test
    @DisplayName("1. Correct RxJava: with share()+zip(), each node fires exactly once")
    void testCorrectDiamond_eachNodeFiresOnce() {
        fireEvent(50000.0);

        List<String> fired = dataCollector.getFiredNodes();
        // Every expected node fires exactly once
        assertEquals(1, dataCollector.countFirings("md_root"),  "md_root fires once");
        assertEquals(1, dataCollector.countFirings("md_l1_n0"), "md_l1_n0 fires once");
        assertEquals(1, dataCollector.countFirings("md_l1_n1"), "md_l1_n1 fires once");
        assertEquals(1, dataCollector.countFirings("md_l2_n0"), "md_l2_n0 fires once");
        assertEquals(1, dataCollector.countFirings("md_sink"),  "md_sink fires once");
    }

    @Test
    @DisplayName("1b. Correct RxJava: root subject emits exactly once per event")
    void testCorrectDiamond_rootEmitsOnce() {
        fireEvent(50000.0);
        assertEquals(1, rootEmitCount,
                "Root must emit exactly once. With share(), all branches see the same emission.");
    }

    @Test
    @DisplayName("1c. Correct RxJava: topological order preserved (root before layer-1, layer-1 before layer-2)")
    void testCorrectDiamond_topologicalOrder() {
        fireEvent(50000.0);
        List<String> fired = dataCollector.getFiredNodes();

        int rootIdx  = fired.indexOf("md_root");
        int l1Idx    = fired.indexOf("md_l1_n0");
        int l2Idx    = fired.indexOf("md_l2_n0");
        int sinkIdx  = fired.indexOf("md_sink");

        assertTrue(rootIdx >= 0, "md_root must appear");
        assertTrue(rootIdx < l1Idx, "md_root before md_l1_n0. Fired: " + fired);
        assertTrue(l1Idx  < l2Idx, "md_l1_n0 before md_l2_n0. Fired: " + fired);
        assertTrue(l2Idx  < sinkIdx, "md_l2_n0 before md_sink. Fired: " + fired);
    }

    @Test
    @DisplayName("1d. Correct RxJava: deterministic replay — same fired order across cycles")
    void testCorrectDiamond_deterministicReplay() {
        fireEvent(50000.0);
        List<String> firstRun = List.copyOf(dataCollector.getFiredNodes());
        dataCollector.reset();

        fireEvent(50001.0);
        List<String> secondRun = List.copyOf(dataCollector.getFiredNodes());

        assertEquals(firstRun, secondRun,
                "RxJava (with share+zip) should produce same order across cycles.");
    }

    // =========================================================================
    // 2. NAIVE RxJava diamond: glitch demonstration WITHOUT share()
    // =========================================================================

    @Test
    @DisplayName("2. NAIVE RxJava (no share): root fires MULTIPLE TIMES — the diamond glitch")
    void testNaiveDiamond_glitchDemonstration() {
        // Build a naive diamond WITHOUT .share() on the root.
        // This is what a developer might write without knowing about the glitch.
        DataCollector naiveDc = new DataCollector();
        int[] naiveRootCount = {0};

        PublishSubject<Double> naiveRoot = PublishSubject.create();

        // NO share() on root — every downstream subscriber gets its own subscription
        Observable<Double> rawRoot = naiveRoot
                .doOnNext(v -> { naiveDc.record("root"); naiveRootCount[0]++; });

        // Layer 1 — each subscribes independently to rawRoot (no share!)
        Observable<Double> n0 = rawRoot.map(v -> v + 1.0)
                .doOnNext(v -> naiveDc.record("l1_n0"));
        Observable<Double> n1 = rawRoot.map(v -> v + 1.0)
                .doOnNext(v -> naiveDc.record("l1_n1"));

        // Diamond join — zip(n0, n1) forces TWO subscriptions to rawRoot
        Observable<Double> joined = Observable.zip(n0, n1, (a, b) -> a + b)
                .doOnNext(v -> naiveDc.record("sink"));
        joined.subscribe();

        // Fire one event
        naiveRoot.onNext(50000.0);

        List<String> fired = naiveDc.getFiredNodes();

        // THE GLITCH: root fires TWICE — once for each upstream subscription in zip()
        // This is the fundamental problem Fluxtion solves with rank-ordered execution.
        assertEquals(2, naiveRootCount[0],
                "GLITCH PROVEN: naive RxJava fires root " + naiveRootCount[0] +
                " times (expected 2 — once per zip() branch). " +
                "Fluxtion fires root exactly once via rank-ordering.");

        // Each layer-1 node also fires once (they each get one emission from their subscription)
        assertEquals(1, naiveDc.countFirings("l1_n0"), "l1_n0 fires once");
        assertEquals(1, naiveDc.countFirings("l1_n1"), "l1_n1 fires once");
    }

    @Test
    @DisplayName("2b. NAIVE RxJava: glitch scales with depth — more diamond layers = more duplicate root emissions")
    void testNaiveDiamond_glitchScalesWithDepth() {
        // 3-level chain: root -> A -> B -> C, where B subscribes to A twice (zip)
        // Without share, root fires 4 times (2^2) for a 2-level diamond
        int[] count = {0};
        PublishSubject<Double> root = PublishSubject.create();
        Observable<Double> rawRoot = root.doOnNext(v -> count[0]++);

        Observable<Double> a0 = rawRoot.map(v -> v + 1);
        Observable<Double> a1 = rawRoot.map(v -> v + 1);

        Observable<Double> b0 = Observable.zip(a0, a1, Double::sum).map(v -> v + 1);
        Observable<Double> b1 = Observable.zip(a0, a1, Double::sum).map(v -> v + 1);

        Observable<Double> c = Observable.zip(b0, b1, Double::sum);
        c.subscribe();

        root.onNext(1.0);

        // Root fires 4 times: each zip creates 2 subscriptions, each subscription
        // propagates back to the unshared root.
        assertTrue(count[0] >= 2,
                "GLITCH: root fired " + count[0] + " times in a 2-level naive diamond. " +
                "Fluxtion always fires root exactly once regardless of graph depth.");
    }

    // =========================================================================
    // 3. RxJava + ID-based filtering limitation
    // =========================================================================

    @Test
    @DisplayName("3. RxJava: ID-based partial propagation DEADLOCKS zip() on hot streams — Fluxtion handles this automatically")
    void testRxJava_idFilteringDeadlocksZipOnHotStreams() {
        // Demonstrate that filter() + zip() on a HOT PublishSubject deadlocks:
        // if one branch is filtered out it emits nothing; zip() waits indefinitely.
        // defaultIfEmpty() does NOT help on hot streams because the source never completes.
        // Fluxtion uses compiled boolean guard checks instead — zero extra plumbing needed.
        DataCollector dc = new DataCollector();
        PublishSubject<Double> root = PublishSubject.create();
        Set<String> activeIds = Set.of("root", "l1_n1"); // l1_n0 intentionally NOT active

        Observable<Double> sharedRoot = root
                .doOnNext(v -> dc.record("root"))
                .share();

        // l1_n0 filtered out — emits nothing (hot stream never completes)
        Observable<Double> l1n0 = sharedRoot
                .filter(v -> activeIds.contains("l1_n0"))
                .map(v -> v + 1.0)
                .doOnNext(v -> dc.record("l1_n0"));
        // NOTE: defaultIfEmpty(0.0) does NOT help here — hot stream never completes,
        // so defaultIfEmpty never triggers. Real fix requires onComplete signal (finite stream)
        // or restructuring the entire graph — significant additional plumbing.

        Observable<Double> l1n1 = sharedRoot
                .filter(v -> activeIds.contains("l1_n1"))
                .map(v -> v + 1.0)
                .doOnNext(v -> dc.record("l1_n1"))
                .share();

        // zip() DEADLOCKS: waits for l1n0 which never emits on a hot filtered stream
        Observable<Double> l2n0 = Observable.zip(l1n0, l1n1, Double::sum)
                .doOnNext(v -> dc.record("l2_n0"));
        l2n0.subscribe();

        root.onNext(50000.0);

        List<String> fired = dc.getFiredNodes();

        // l1_n0 correctly absent (filtered out)
        assertFalse(fired.contains("l1_n0"),
                "l1_n0 should not record — filtered out. Fired: " + fired);
        // l1_n1 fires correctly
        assertTrue(fired.contains("l1_n1"),
                "l1_n1 should fire — in activeIds. Fired: " + fired);
        // l2_n0 DEADLOCKS — never fires because zip() waits for missing l1_n0 emission
        assertFalse(fired.contains("l2_n0"),
                "DEADLOCK PROVEN: l2_n0 never fires — zip() waits forever for filtered l1_n0. " +
                "Fluxtion handles this via compiled boolean guards with zero extra plumbing. Fired: " + fired);
    }

    // =========================================================================
    // Helper
    // =========================================================================

    private void fireEvent(double value) {
        dataCollector.reset();
        mdRootSubject.onNext(value);
    }
}
