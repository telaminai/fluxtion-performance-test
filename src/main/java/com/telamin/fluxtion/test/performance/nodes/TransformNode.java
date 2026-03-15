package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Multiplies the upstream value by a configurable factor.
 * Subclass of the logical node hierarchy — demonstrates polymorphic dispatch.
 * In Fluxtion the call-site is monomorphic (compiled); in dynamic frameworks
 * the JVM must resolve the virtual method at runtime.
 * Used in: polymorphic benchmark.
 */
public class TransformNode implements ProcessingNode {
    private String nodeId = "transform";
    private ProcessingNode upstream1;
    private double factor = 1.0;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        double upstreamValue = upstream1 == null ? 0.0 : upstream1.getValue();
        value = upstreamValue * factor;
        return true;
    }

    @Override
    public double getValue() { return value; }

    @Override
    public String getNodeId() { return nodeId; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(ProcessingNode upstream1) { this.upstream1 = upstream1; }
    public void setFactor(double factor) { this.factor = factor; }
}
