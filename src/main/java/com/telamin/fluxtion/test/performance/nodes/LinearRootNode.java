package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Bridges MarketDataRootNode to LinearNode chain.
 * NO INHERITANCE.
 */
public class LinearRootNode {
    private String nodeId = "linearRoot";
    private MarketDataRootNode upstream1;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.getValue() + 1.0;
        return true;
    }

    public double getValue() { return value; }
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(MarketDataRootNode upstream1) { this.upstream1 = upstream1; }
}