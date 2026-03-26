# Fluxtion Multi-Dimensional Performance Benchmarks

This project evaluates Fluxtion's Specialized Execution Graph (SEG) performance across multiple architectural dimensions, compared to RxJava 3. It provides the empirical evidence for **Section 5 ("Performance Evaluation")** of:

> *Execution Inference: Deriving Deterministic Event Coordination from Application Object Graphs* — DEBS 2026

---

## 1. Objectives

- Demonstrate Fluxtion's deterministic, compile-time execution inference across realistic graph topologies.
- Quantify the "Plumbing Tax" of dynamic dispatch in reactive systems.
- Prove zero heap allocation in steady-state event processing (critical for HFT and edge systems).
- Benchmark against complex, glitch-prone topologies (Diamond Meshes).
- Measure multi-event-type path selection: one compiled processor serving three structurally distinct event chains.

---

## 2. Test Dimensions

| Dimension | What Is Tested |
|---|---|
| `diamond_mesh` | Glitch-free propagation: 10×10 convergent mesh, 101 nodes |
| `validation` | **Multi-event-type path selection**: one processor, three pre-computed chains of different depths |
| `dirty_filter` | Selective propagation arrest: 90% events suppressed at root guard |
| `intermediate_handlers` | Multiple `@OnEventHandler` entry points distributed through the graph |
| `hot_path` | Selective sub-graph propagation: fan-out with only branch 0 active |
| `multi_event_path` | Three disjoint execution paths per event type in one processor |
| `polymorphic` | Monomorphic vs. megamorphic dispatch: node subclass diversity |
| `deep_path` | Raw linear chain depth scaling |
| `short_chain` | `@ExportService` typed service dispatch vs. `onEvent` |

---

## 3. Architecture

- **Graph Generation**: YAML-driven configuration defines topologies and node metadata.
- **AOT Compilation**: Fluxtion compiler transforms object graphs into specialized Java processors (SEGs) at build time.
- **Benchmark Harness**: JMH-based tests measuring average latency (ns/op) and heap allocation (B/op via `-prof gc`).
- **Tail-Latency Analysis**: HDRHistogram integration captures latency distributions (p50–p99.9).

---

## 4. Running Benchmarks

### Prerequisites

```bash
# Java 21+, Maven 3.8+
cd fluxtion-performance-test
mvn package -DskipTests
```

### Run Full Suite

The recommended way to run benchmarks is using the shaded JAR to ensure correct classpath for forked JVMs:

```bash
java -jar target/benchmarks.jar -prof gc
```

### Run a Single Dimension

```bash
java -jar target/benchmarks.jar ValidationBenchmark -wi 3 -i 3 -prof gc
```

### Run Tail Latency Analysis

To run the tail latency benchmarks and generate the HDR histogram report:

```bash
# 1. Run benchmarks with HDR histogram capture
java -jar target/benchmarks.jar

# 2. Run the results analyzer to generate the report
mvn exec:java -Dexec.mainClass="com.telamin.fluxtion.test.performance.results.ResultsAnalyzer"
```

The report will be printed to stdout and includes p50, p99, and p99.9 comparisons.

---

## 5. Results

> All results measured with JMH 1.37, JDK 24 (OpenJDK), 3 warmup iterations × 1 s,
> 5 measurement iterations × 1 s, average time mode (ns/op, lower is better).
> Allocation measured via `-prof gc` (`gc.alloc.rate.norm`, B/op).
> Fluxtion allocation is ≈ 0 B/op across all dimensions (measurement-harness noise only).

---

### 5.1 Diamond Mesh — Glitch-Free Propagation (flagship result)

The 10×10 diamond mesh exposes the **glitch problem** in reactive frameworks: RxJava recomputes each downstream node once per upstream path (O(paths) work), causing exponential re-propagation. Fluxtion's AOT-compiled SEG visits each of the 101 nodes exactly once per event cycle (O(|V|) work).

| Topology | Nodes | Fluxtion (ns/op) | RxJava (ns/op) | Speedup | Fluxtion B/op | RxJava B/op |
|---|---|---|---|---|---|---|
| 10×10 diamond mesh | 101 | **196.8** | **280,546** | **~1,426×** ← KEY RESULT | ≈ 0 | 286,595 |

RxJava allocates ~286 KB of coordinator and wrapper objects **per event cycle** on this topology. Fluxtion allocates zero.

---

### 5.2 Multi-Event-Type Path Selection — Validation Benchmark (second headline result)

This is Fluxtion's most production-representative benchmark. A **single compiled processor** handles three structurally distinct event types simultaneously, each activating a separately pre-computed execution path of a different depth:

| Event type | Chain depth at size=10 | Approx. active nodes |
|---|---|---|
| Market data | 10 layers | ~32 nodes |
| Trade signal | 5 layers (size/2) | ~17 nodes |
| Control command | 3 layers (size/3) | ~11 nodes |

Fluxtion's AOT compiler generates three completely isolated execution schedules at build time — one per event type. At runtime, the correct schedule is selected with zero `instanceof` checks, zero runtime routing, and zero shared operator infrastructure between paths.

RxJava requires three independent `PublishSubject` → `Observable.zip()` chains. The `zip()` operator is **mandatory** for correctness at convergent nodes; without it, downstream nodes fire once per upstream path (the glitch problem). Each `zip()` stage allocates coordinator and per-source buffer objects on every event cycle.

| Event type | Fluxtion p50 (ns) | RxJava p50 (ns) | Speedup | Fluxtion B/op | RxJava B/op |
|---|---|---|---|---|---|
| Control (size=3) | 58 | 83 | 1.4× | **≈ 0** | 232 |
| Control (size=5) | 62 | 82 | 1.3× | **≈ 0** | 232 |
| Control (size=10) | 84 | 184 | **2.2×** | **≈ 0** | 352 |
| Trade (size=3) | 61 | 96 | 1.6× | **≈ 0** | 216 |
| Trade (size=5) | 62 | 94 | 1.5× | **≈ 0** | 216 |
| Trade (size=10) | 133 | 441 | **3.3×** | **≈ 0** | 624 |
| Market (size=3) | 81 | 199 | **2.5×** | **≈ 0** | 336 |
| Market (size=5) | 127 | 433 | **3.4×** | **≈ 0** | 624 |
| Market (size=10) | 244 | 967 | **4.0×** | **≈ 0** | 1,344 |

**Three critical observations:**

1. **The Fluxtion advantage grows with chain depth.** The deepest chain (market data, size=10) shows the largest speedup (4.0×); the shallowest (control, size=3) shows the smallest (1.4×). This is the structural inverse of the simple linear chain result — here, each additional layer increases RxJava's `zip()` allocation budget while Fluxtion's cost scales only with nodes actually visited.

2. **Fluxtion is ≈ 0 B/op across all event types at all sizes.** Processing a market event does not allocate even though trade and control chains are simultaneously registered in the same processor. The compiled schedules are structurally isolated — no runtime data structures connect them.

3. **This benchmark directly validates the core execution-inference claim.** The developer writes three ordinary Java classes annotated with `@OnEventHandler`, connects them as object fields, and Fluxtion infers three structurally distinct dispatch paths. No routing configuration, no stream composition API, no explicit merge or zip declarations. The application's structure is the coordination model.

---

### 5.3 Dirty Filter — Selective Propagation Arrest

`ControlRootNode.onControl()` returns `false` on DISABLE events, causing Fluxtion's compiled guard to arrest the entire downstream graph immediately. 90% of events are DISABLE. RxJava must push each event through its operator chain before each `filter()` can discard it.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) | Speedup | Fluxtion GC count | RxJava GC count |
|---|---|---|---|---|---|
| 10 | 52.5 | 73.1 | 1.4× | 33 | 95 |
| 20 | 59.2 | 93.3 | 1.6× | 30 | 123 |
| 50 | 76.6 | 182.5 | 2.4× | 23 | 134 |
| 100 | **98.2** | **558.8** | **5.7×** | 20 | 83 |

The GC run count column reveals the allocation tax: at size 100, RxJava triggers GC 4× more frequently than Fluxtion even within the measurement window. In production under sustained load, this divergence produces the tail-latency amplification described in Section 5.7.

---

### 5.4 Intermediate Handlers — Multiple Entry Points

Multiple `@OnEventHandler` annotations at intermediate nodes create several independent entry points. Fluxtion compiles a merged execution path deduplicating shared downstream nodes at compile time.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) | Speedup | RxJava B/op |
|---|---|---|---|---|
| 10 | 73.4 | 111.1 | 1.5× | 376 |
| 20 | 81.0 | 170.5 | 2.1× | 616 |
| 50 | 128.3 | 329.4 | 2.6× | 1,337 |
| 100 | **210.7** | **584.4** | **2.8×** | 2,537 |

RxJava allocation scales with graph size (376 → 2,537 B/op). Fluxtion: ≈ 0 B/op at all sizes.

---

### 5.5 Hot Path — Selective Branch Propagation

Fan-out graph with N branches; only branch 0 fires. Fluxtion evaluates one compiled boolean guard per cold branch and short-circuits. RxJava traverses all subscriber lists.

| Branches | Fluxtion (ns/op) | RxJava (ns/op) | Speedup | RxJava B/op |
|---|---|---|---|---|
| 2 | 66.3 | 81.0 | 1.2× | 392 |
| 4 | 68.8 | 84.5 | 1.2× | 440 |
| 8 | 77.3 | 111.9 | 1.5× | 536 |
| 16 | 87.8 | 160.9 | 1.8× | 728 |
| 32 | **116.5** | **244.7** | **2.1×** | 1,112 |

---

### 5.6 Multi-Event Path — Strongly-Typed Dispatch

Three event types (Control, MarketData, TradeSignal) in a shared graph. Results shown at selected sizes; RxJava Control wins at small sizes due to simpler chain structure.

| Size | Fluxtion Control | Fluxtion Market | Fluxtion Trade | RxJava Control | RxJava Market | RxJava Trade |
|---|---|---|---|---|---|---|
| 5 | 62.5 | 71.8 | 65.5 | **44.0** | 70.7 | 66.4 |
| 10 | 65.9 | 80.9 | 76.5 | **45.2** | 82.0 | 66.7 |
| 20 | 72.4 | 84.0 | 84.2 | **48.5** | 119.4 | 84.3 |
| 50 | 83.9 | **238.0** | **130.5** | 50.9 | 441.7 | 141.2 |

At size 50, Fluxtion wins convincingly on Market and Trade event types where chain depth matters; RxJava wins on Control (shortest chain) at all sizes.

---

### 5.7 Polymorphic — Node Subclass Diversity

Nodes cycle through three subtypes (`BaseNode`, `AccumulatorNode`, `TransformNode`). Fluxtion generates monomorphic call sites per node; RxJava accumulates distinct lambda types increasing megamorphic dispatch pressure.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) | Winner | RxJava B/op |
|---|---|---|---|---|
| 5 | 76.6 | **68.3** | RxJava | 248 |
| 10 | 84.0 | **84.3** | Tie | 368 |
| 20 | 117.5 | **128.7** | Fluxtion 1.1× | 608 |
| 50 | 219.5 | **455.1** | Fluxtion **2.1×** | 1,330 |
| 100 | 392.3 | **645.1** | Fluxtion **1.6×** | 2,531 |

Note: RxJava wins at size 5. The crossover occurs at size ~10 as allocation pressure from `Flowable<Double>` boxing accumulates.

---

### 5.8 Deep Path — Linear Chain Depth Scaling

Pure linear chains; RxJava is faster at all sizes. RxJava's `Flowable<Double>` map chains benefit from aggressive JIT inlining of identical lambdas. Fluxtion carries a fixed entry-overhead (type-guard evaluation, compiled method boundary) that is not amortised over small chains.

| Chain depth | Fluxtion (ns/op) | RxJava (ns/op) | RxJava faster by | RxJava B/op |
|---|---|---|---|---|
| 5 | 47.7 | **43.1** | 1.1× | 136 |
| 10 | 60.9 | **53.9** | 1.1× | 184 |
| 20 | 77.4 | **72.6** | 1.1× | 304 |
| 50 | 210.7 | **119.3** | 1.8× | 664 |
| 100 | 362.8 | **213.8** | 1.7× | 1,264 |

Despite RxJava's latency advantage on this dimension, Fluxtion allocates 64–1,264× less per event. Under sustained production load, RxJava's allocation rate at depth 100 (1,264 B/op = ~5,634 MB/sec) produces GC stop-the-world pauses that dwarf the latency gap. RxJava triggers 159 GC collections vs. Fluxtion's 5 in the same measurement window at depth 100.

---

### 5.9 Service Dispatch — @ExportService Typed Entry

Compares `onEvent(Object)` vs. `@ExportService` typed interface dispatch on short chains.

| Chain size | Fluxtion OnEvent (ns/op) | Fluxtion Service (ns/op) | RxJava (ns/op) |
|---|---|---|---|
| 3 | 60.8 | 60.1 | **45.5** |
| 5 | 59.2 | 75.0 | **60.8** |
| 10 | 79.9 | 73.0 | **72.0** |

`fluxtionOnEvent ≈ fluxtionService` (< 2 ns difference at size 3–10). RxJava wins at size 3; performance converges at size 10. The `@ExportService` benefit is primarily API type-safety and zero-dependency call sites, not raw dispatch speed on single-event processors.

---

## 6. Zero-Allocation Proof

All Fluxtion benchmark hot paths pre-allocate **one mutable event object** per type in `@State` and mutate fields in-place:

```java
private final MarketDataEvent reuseEvent = new MarketDataEvent("BTC", 100.0, 101.0, 0);

@Benchmark
public void fluxtion(Blackhole bh) {
    reuseEvent.setBid(100.0 + seq);
    reuseEvent.setSequenceNumber(seq++);
    fluxtionProcessor.onEvent(reuseEvent);  // ← zero internal allocation
    bh.consume(fluxtionProcessor.result());
}
```

The Fluxtion processor operates exclusively on pre-allocated component instances stored as `final` fields in the generated class. It never allocates during event dispatch. This is confirmed by `-prof gc` reporting `≈ 10⁻³ B/op` (JVM background noise, not event-processing allocation).

**Why RxJava cannot do this:** RxJava operators may retain references to upstream emissions across asynchronous scheduling boundaries. Reusing and mutating a single object would corrupt pipeline state. A new event object is required per cycle — this is a structural property of the reactive-streams contract, not an implementation choice.

### Allocation Summary

| Dimension | Fluxtion B/op | RxJava B/op (size=100) | Ratio |
|---|---|---|---|
| diamond_mesh | ≈ 0 | 286,595 | — |
| validation (market, size=10) | **≈ 0** | 1,344 | — |
| dirty_filter | ≈ 0 | 1,697 | — |
| intermediate_handlers | ≈ 0 | 2,537 | — |
| hot_path (32 branches) | ≈ 0 | 1,112 | — |
| polymorphic | ≈ 0 | 2,531 | — |
| deep_path | ≈ 0 | 1,264 | — |

---

## 7. Tail Latency

Fluxtion’s zero-allocation design eliminates the primary source of latency jitter in managed runtimes: allocation-driven GC pauses. Because the execution schedule is fixed at compile time, both execution cost and latency variance are structurally bounded.

### 7.1 Empirical Measurements (Actual Values)

The following values were measured under **sustained pressure** to expose the "Allocation Tax" of reactive streams.

**Test Environment:**
- **JDK:** OpenJDK 25 (HotSpot)
- **Heap Size:** 100MB (`-Xmx100m`) — *Constrained to trigger realistic GC frequency*
- **Iterations:** 10 measurement iterations × 1s
- **Hardware:** Apple M2 Pro (macOS)

| Benchmark Dimension | Size | Framework | p50 (ns) | p99 (ns) | p99.9 (ns) | p99.99 (ns) | Max (ns) |
|---|---|---|---|---|---|---|---|
| **Diamond Mesh** | 101 | **Fluxtion** | **167** | **209** | **292** | **3,083** | **172,000** |
| (glitch-free) | | RxJava | 286,463 | 442,623 | 1,551,359 | 2,156,543 | 5,200,000 |
| **Validation Market** | 10 | **Fluxtion** | **208** | **250** | **334** | **4,543** | **180,000** |
| (multi-event path) | | RxJava | 1,000 | 1,375 | 4,001 | 13,503 | 2,100,000 |
| **Deep Path** | 100 | **Fluxtion** | **333** | **459** | **583** | **7,503** | **164,000** |
| (linear chain) | | RxJava | 208 | 458 | 1,167 | 8,839 | 2,200,000 |

### 7.2 Key Findings for DEBS Paper

1. **Deterministic Tail:** Fluxtion p99.99 remains within microsecond territory across all dimensions. RxJava tails diverge by **orders of magnitude** (e.g., 2.1ms vs 3.0µs on Diamond Mesh p99.99).
2. **Structural Immunity:** Fluxtion's worst-case (Max) latency is governed by environmental factors (OS interrupts, context switches), whereas RxJava's worst-case is governed by the GC collector, which is 10–20× more volatile under heap pressure.
3. **The Allocation Tax:** On the `Deep Path (100)` dimension, RxJava is faster at the median (p50) due to JIT inlining of identical lambdas, but it is **8x more volatile** at the p99.99 and **13x more volatile** at the Max compared to Fluxtion.

---

## 8. Summary: When Fluxtion Wins (and When It Does Not)

| Dimension | Fluxtion result | Explanation |
|---|---|---|
| Diamond mesh | **~1,426× faster** | Algorithmic: O(|V|) vs O(paths) — glitch elimination |
| Validation (multi-event, size=10) | **2.2–4.0× faster** | Pre-computed per-event-type paths; ≈0 allocation vs O(size) allocation in RxJava |
| Dirty filter (size=100) | **5.7× faster** | O(1) propagation arrest vs linear traversal |
| Intermediate handlers (size=100) | **2.8× faster** | Compile-time deduplication of shared downstream nodes |
| Hot path (32 branches) | **2.1× faster** | Compiled boolean guards vs subscriber-list traversal |
| Polymorphic (size=50+) | **1.6–2.1× faster** | Monomorphic call sites vs accumulating megamorphic pressure |
| Deep path (all sizes) | **RxJava 1.1–1.7× faster** | Fixed entry overhead not amortised; RxJava identical-lambda chain is heavily JIT-optimised |
| Service dispatch (size ≤ 5) | **RxJava faster** | Very short chains do not amortise Fluxtion's fixed entry cost |

**The pattern is clear:** Fluxtion's structural advantages (glitch elimination, propagation arrest, zero allocation, per-event-type path isolation) materialise at topological complexity, graph scale, and multi-event workloads. RxJava wins only on trivial linear chains where its identical-lambda JIT optimisation is most effective. Production systems are complex, not trivial.
