# Fluxtion Multi-Dimensional Performance Benchmarks

This project is designed to evaluate Fluxtion's Specialized Execution Graph (SEG) performance across various architectural dimensions compared to traditional reactive frameworks (e.g., RxJava, Project Reactor).

## 1. Objectives
- Demonstrate Fluxtion's deterministic execution and near-zero latency overhead.
- Quantify the "Plumbing Tax" of dynamic dispatch in reactive systems.
- Benchmark against complex, glitch-prone topologies (e.g., Diamond Meshes).
- Assess performance across multiple dimensions: graph depth, event variety, polymorphism, and propagation control.

## 2. Test Dimensions
The benchmark suite evaluates performance along the following axes:
- **Graph Topology**: Deep single-path chains vs. complex branching meshes.
- **Event Types**: Multiple strongly-typed events (not just primitives) to test dispatch efficiency.
- **Handler Diversity**: Multiple handlers per event, and handlers distributed across both top-level and intermediate nodes.
- **Propagation Logic**: Use of `true`/`false` return values in handlers to conditionally arrest or continue propagation (dirty filtering).
- **Node Polymorphism**: Subclasses of nodes with varying internal logic to test JIT optimization and call-site monomorphism.
- **Filtering**: Comparing raw propagation vs. selective sub-graph propagation.

## 3. Architecture
- **Graph Generation**: Uses a YAML-driven configuration to define graph topologies and node metadata.
- **AOT Compilation**: Fluxtion compiler transforms the configuration (via Spring XML or Builder) into a specialized Java processor (SEG).
- **Benchmark Harness**: JMH-based tests measuring throughput, average latency, and tail-latency distributions.
- **Latentcy Analysis**: Integrated with **HDRHistogram** and **jHiccup** to capture high-fidelity latency profiles and machine-level interference.

## 4. Usage
### Graph Generation
Define a test scenario in `src/main/resources/scenarios.yaml`:
```yaml
scenarios:
  - name: "DeepChain"
    layers: 100
    nodesPerLayer: 1
    topology: "LINEAR"
    events: ["MARKET_DATA"]
```
Run `GenerateFluxtionProcessor` to create the AOT code.

### Running Benchmarks
Use Maven to execute the JMH suite:
```bash
mvn exec:java -Dexec.mainClass="org.openjdk.jmh.Main" -Dexec.args="-f 0 -prof gc"
```

## 5. Results

> All results measured with JMH 1.37, JDK 25.0.2 (GraalVM), 1 fork, 3 warmup iterations × 1 s, 5 measurement iterations × 1 s, average time mode (ns/op, lower is better).

### 5.1 Diamond Mesh — Glitch-Free Propagation (flagship)

The diamond mesh topology exposes the "glitch" problem in reactive frameworks: RxJava recomputes downstream nodes once per upstream path, causing exponential work. Fluxtion's AOT-compiled SEG propagates each event exactly once per node.

| Nodes (10×10 mesh) | Fluxtion (ns/op) | RxJava (ns/op) | Fluxtion × faster |
|--------------------|-----------------|----------------|-------------------|
| 101                | 258.7           | 323,788.6      | **~1,251×**       |

### 5.2 Dirty Filter — Conditional Propagation

Fluxtion handlers return `true`/`false` to arrest or continue propagation, eliminating unnecessary downstream work.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) | Fluxtion × faster |
|------------|-----------------|----------------|-------------------|
| 10         | 69.4            | 94.6           | 1.4×              |
| 20         | 71.8            | 95.0           | 1.3×              |
| 50         | 79.3            | 161.1          | 2.0×              |
| 100        | 96.9            | 305.4          | **3.2×**          |

### 5.3 Intermediate Handlers — Distributed Event Handling

Handlers at intermediate nodes (not just leaf nodes) exercise Fluxtion's dispatch efficiency across the full graph.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) | Fluxtion × faster |
|------------|-----------------|----------------|-------------------|
| 10         | 71.5            | 77.3           | 1.1×              |
| 20         | 82.9            | 118.0          | 1.4×              |
| 50         | 103.5           | 210.7          | **2.0×**          |
| 100        | 171.5           | 370.5          | **2.2×**          |

### 5.4 Hot Path — Parallel Branch Scaling

A single root event fans out across an increasing number of hot (active) branches.

| Branches | Fluxtion (ns/op) | RxJava (ns/op) |
|----------|-----------------|----------------|
| 2        | 85.3            | 48.0           |
| 4        | 86.2            | 68.5           |
| 8        | 86.1            | 77.8           |
| 16       | 106.6           | 87.8           |
| 32       | 152.0           | 128.9          |

### 5.5 Deep Path — Chain Depth Scaling

Linear chains of increasing depth; both frameworks exhibit linear scaling.

| Chain depth | Fluxtion (ns/op) | RxJava (ns/op) |
|-------------|-----------------|----------------|
| 5           | 69.4            | 45.3           |
| 10          | 83.3            | 56.8           |
| 20          | 94.7            | 74.6           |
| 50          | 269.9           | 125.7          |
| 100         | 521.3           | 224.7          |

### 5.6 Multi-Event Path — Strongly-Typed Dispatch

Three distinct event types (Control, MarketData, TradeSignal) routed through the same graph.

| Graph size | Fluxtion Control | Fluxtion Market | Fluxtion Trade | RxJava Control | RxJava Market | RxJava Trade |
|------------|-----------------|-----------------|----------------|----------------|---------------|--------------|
| 5          | 53.5            | 68.9            | 67.3           | 35.5           | 46.1          | 41.7         |
| 10         | 59.1            | 76.5            | 81.5           | 34.2           | 44.8          | 51.4         |
| 20         | 64.1            | 97.2            | 85.6           | 37.1           | 79.9          | 57.2         |
| 50         | 72.6            | 269.3           | 164.1          | 40.0           | 130.0         | 86.9         |

### 5.7 Polymorphic — Node Subclass Diversity

Nodes use subclasses with varying internal logic, stressing JIT monomorphism.

| Graph size | Fluxtion (ns/op) | RxJava (ns/op) |
|------------|-----------------|----------------|
| 5          | 72.9            | 53.3           |
| 10         | 83.4            | 49.1           |
| 20         | 111.9           | 79.9           |
| 50         | 238.3           | 131.2          |
| 100        | 496.7           | 241.0          |

### 5.8 Service Dispatch — OnEvent vs Service Interface

Compares direct `onEvent` dispatch against service-interface-based dispatch within Fluxtion.

| Chain size | Fluxtion OnEvent (ns/op) | Fluxtion Service (ns/op) | RxJava (ns/op) |
|------------|--------------------------|--------------------------|----------------|
| 3          | 61.9                     | 64.9                     | 36.0           |
| 5          | 62.6                     | 62.3                     | 37.7           |
| 10         | 70.5                     | 69.5                     | 48.3           |
