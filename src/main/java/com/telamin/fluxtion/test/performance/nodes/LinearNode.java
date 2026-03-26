package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Highly optimized linear node:
 * - NO INTERFACE.
 * - Direct field access to concrete upstream type.
 * - No null checks.
 * - Minimal body (v = u.getValue() + 1.0).
 */
public class LinearNode {
    private String nodeId = "linear";
    public double value;
    private LinearNode upstream1; 

    @OnTrigger
    public final boolean onUpstreamUpdate() {
        // direct field access avoids a virtual call entirely
        value = upstream1.value + 1.0;
        return true;
    }

    public final double getValue() { return value; }
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(LinearNode upstream1) { this.upstream1 = upstream1; }
}