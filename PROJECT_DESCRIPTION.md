# Fluxtion Performance Test — Project Description

## Purpose

This project provides the benchmarks and supporting evidence for **Section 5 ("Performance Evaluation")** of the paper:

> *Execution Inference: Deriving Deterministic Event Coordination from Application Object Graphs*

It compares **Fluxtion** (AOT-compiled, deterministic SEG execution) against **RxJava 3** (dynamic reactive streams) across a range of graph topologies and behavioural dimensions. The goal is to quantify the "Plumbing Tax" of dynamic dispatch and demonstrate Fluxtion's superiority in latency, allocation, and tail-latency jitter for edge/HFT workloads.

---

## Architecture Overview

```
src/main/java/com/telamin/fluxtion/test/performance/
├── events/          # Strongly-typed event POJOs (MarketData, TradeSignal, ControlEvent, …)
├── nodes/           # Node class hierarchy (base + polymorphic subclasses)
├── generators/      # Spring XML graph generators, one per benchmark dimension
├── generated/       # AOT-generated Fluxtion processors (do not hand-edit)
├── benchmark/       # JMH benchmark classes, one per dimension
└── results/         # HDR histogram capture + result reporting utilities

src/main/resources/
├── graphs/          # Generated Spring XML graph definitions
└── benchmark-configs/   # YAML files describing each benchmark dimension
```

---

## Benchmark Dimensions

Each dimension is described by a YAML config file in `src/main/resources/benchmark-configs/`. A YAML file specifies:
- `dimension` — the axis being tested (e.g. `deep_path`, `polymorphic`, `dirty_filter`)
- `description` — human-readable explanation used in the paper
- `sizes` — list of node-counts / layer-counts to sweep
- `graphClass` — the Java generator class that produces the Spring XML

### Dimensions Implemented

| ID | Title | What it tests |
|----|-------|---------------|
| `deep_path` | Deep Single-Path Chain | Latency scaling with depth; no branching |
| `hot_path` | Multiple Paths — Hot Path | Selective propagation; only one sub-tree fires |
| `polymorphic` | Polymorphic Nodes | Runtime subtype selection vs. compiled monomorphic dispatch |
| `dirty_filter` | Dirty Propagation On/Off | Guard-check pruning under noisy (90 % filtered) feeds |
| `intermediate_handlers` | Intermediate Event Handlers | Event entry points at non-root nodes vs. top-level only |
| `diamond_mesh` | Diamond Mesh (original) | Multi-path join; glitch-free propagation |

---

## Event Types

The benchmark deliberately uses **rich, strongly-typed events** instead of primitives:

| Class | Meaning | Used by |
|-------|---------|---------|
| `MarketDataEvent` | Bid/ask price update | `deep_path`, `diamond_mesh`, `hot_path` |
| `TradeSignalEvent` | Buy/sell instruction with quantity | `polymorphic`, `intermediate_handlers` |
| `ControlEvent` | Enables/disables propagation flags | `dirty_filter` |

Each event implements `com.telamin.fluxtion.runtime.event.Event`.

---

## Node Class Hierarchy

```
ProcessingNode (interface)
├── BaseNode          — simple value accumulator; always propagates
├── FilteringNode     — propagates only when value crosses a threshold (dirty=false on filter)
├── AccumulatorNode   — running sum; demonstrates stateful computation
├── TransformNode     — multiplies upstream values by a factor (subclass polymorphism)
└── PublisherNode     — terminal node; collects output for blackhole consumption
```

Nodes accept `@OnTrigger` methods. Root nodes use `@OnEventHandler`.

---

## Workflow: Adding a New Dimension

1. Create a YAML file in `src/main/resources/benchmark-configs/<dim>.yaml`
2. Create a generator class `generators/<Dim>GraphGenerator.java` that reads the YAML and writes a Spring XML file to `src/main/resources/graphs/<dim>-<size>.xml`
3. Run `GenerateAllProcessors.java` to invoke the Fluxtion AOT compiler for each XML → produces a `generated/<Dim>Processor_<size>.java`
4. Add a `@Benchmark` method in `benchmark/<Dim>Benchmark.java`
5. Run `BenchmarkSuite.java` — results are written as HDR `.hlog` files under `target/results/`

---

## Running

```bash
# 1. Regenerate all Spring XML graphs and AOT processors
mvn compile exec:java -Dexec.mainClass="com.telamin.fluxtion.test.performance.generators.GenerateAllProcessors"

# 2. Run all JMH benchmarks (non-forked, quick)
mvn exec:java -Dexec.mainClass="org.openjdk.jmh.Main" -Dexec.args=".*Benchmark -f 0"

# 3. Full benchmark run with HDR output
mvn exec:java -Dexec.mainClass="org.openjdk.jmh.Main" \
  -Dexec.args=".*Benchmark -f 1 -rf json -rff target/results/jmh-results.json"
```

---

## Key Results (quick smoke run — 2 warmup / 2 measure iterations)

### Original Diamond Mesh (101 nodes, 11 layers)
| Benchmark | Avg Latency | Allocation |
|-----------|------------|------------|
| Fluxtion — 101-node Diamond Mesh | ~74 ns/op | ~32 B/op |
| RxJava 3 — equivalent graph | ~325,000 ns/op | ~286 KB/op |
**Speedup: ~4,400×.  Allocation reduction: ~9,000×.**

### Multi-Dimension Results (p50 latency ns, quick run)

| Dimension | Size | Fluxtion p50 (ns) | RxJava p50 (ns) | Speedup |
|-----------|------|-------------------|-----------------|---------|
| deep_path | 100 | 375 | 417 | 1.1× |
| dirty_filter | 20 | 42 | 83 | **2.0×** |
| dirty_filter | 50 | 42 | 416 | **9.9×** |
| dirty_filter | 100 | 42 | 833 | **19.8×** |
| hot_path | 16 | 42 | 125 | **3.0×** |
| hot_path | 32 | 84 | 208 | **2.5×** |
| intermediate_handlers | 20 | 42 | 166 | **4.0×** |
| intermediate_handlers | 100 | 167 | 625 | **3.7×** |
| polymorphic | 50 | 167 | 417 | **2.5×** |
| polymorphic | 100 | 375 | 833 | **2.2×** |

**Key insight — dirty_filter:** Fluxtion's compiled guard check arrests the entire graph at the root,
staying flat at 42 ns regardless of chain length. RxJava must traverse its listener list before
each `filter()` can discard, growing linearly with chain depth.

### Running the ResultsAnalyzer
```bash
# Full speedup comparison table
mvn exec:java -Dexec.mainClass="com.telamin.fluxtion.test.performance.results.ResultsAnalyzer"

# Filter by dimension
mvn exec:java -Dexec.mainClass="...ResultsAnalyzer" -Dexec.args="-d dirty_filter"

# Raw HDR percentile table (p50/p90/p99/p99.9/max)
mvn exec:java -Dexec.mainClass="...ResultsAnalyzer" -Dexec.args="-r"

# Filter by framework and size
mvn exec:java -Dexec.mainClass="...ResultsAnalyzer" -Dexec.args="-f fluxtion -s 100"
```

---

## Dependencies

- Fluxtion runtime + builder + AOT compiler (private Repsy repo)
- RxJava 3.1.8
- JMH 1.37
- HdrHistogram 2.2.1
- SnakeYAML 2.3
- Spring Context 6.2.3 (graph realisation)
- Lombok 1.18.34
