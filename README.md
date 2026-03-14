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
Results are captured in HDR formats and can be queried or visualized via the interactive query tool.
