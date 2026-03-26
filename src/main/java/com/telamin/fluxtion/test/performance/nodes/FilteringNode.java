package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Propagates only when the upstream value crosses a configurable threshold.
 * Returns false (dirty=false) when the value does NOT cross threshold — this arrests
 * downstream propagation, demonstrating Fluxtion's selective sub-graph pruning.
 * Used in: dirty_filter benchmark.
 */
public class FilteringNode implements PolymorphicNode {
    private String nodeId = "filter";
    private PolymorphicNode upstream1;
    private double threshold = 0.0;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        double upstreamValue = upstream1.getValue();
        if (upstreamValue > threshold) {
            value = upstreamValue;
            return true;   // propagate — value crossed threshold
        }
        return false;      // suppress — arrests all downstream nodes
    }

    @Override
    public final double getValue() { return value; }
    @Override
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(PolymorphicNode upstream1) { this.upstream1 = upstream1; }
    public void setThreshold(double threshold) { this.threshold = threshold; }
}
