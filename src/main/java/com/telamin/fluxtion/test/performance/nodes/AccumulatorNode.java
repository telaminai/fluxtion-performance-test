package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Running-sum accumulator. Adds upstream value to an internal total on every trigger.
 * Always propagates. Demonstrates stateful computation in deep chains.
 * Used in: deep_path, hot_path benchmarks.
 */
public class AccumulatorNode implements ProcessingNode {
    private String nodeId = "accumulator";
    private ProcessingNode upstream1;
    private double total;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        double upstreamValue = upstream1 == null ? 0.0 : upstream1.getValue();
        total += upstreamValue;
        value = total;
        return true;
    }

    public void reset() { total = 0; value = 0; }

    @Override
    public double getValue() { return value; }

    @Override
    public String getNodeId() { return nodeId; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(ProcessingNode upstream1) { this.upstream1 = upstream1; }
}
