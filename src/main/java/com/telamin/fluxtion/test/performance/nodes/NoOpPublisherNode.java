package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Sink for No-Op chain.
 * NO INHERITANCE.
 */
public class NoOpPublisherNode implements NoOpPathNode {
    private String nodeId = "publisher";
    private NoOpPathNode upstream1;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.getValue();
        return true;
    }

    @Override
    public final double getValue() { return value; }
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(NoOpPathNode upstream1) { this.upstream1 = upstream1; }
}