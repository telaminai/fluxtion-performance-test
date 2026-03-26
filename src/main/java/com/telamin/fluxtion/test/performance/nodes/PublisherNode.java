package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Terminal node — collects the final output of a processing chain.
 * Its getValue() is consumed by the JMH Blackhole to prevent dead-code elimination.
 * Always propagates (terminal nodes should not suppress).
 * Used in: all benchmark dimensions as the sink node.
 */
public class PublisherNode implements GeneralNode {
    private String nodeId = "publisher";
    private GeneralNode upstream1;
    private double value;
    private long publishCount;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.getValue();
        publishCount++;
        return true;
    }

    @Override
    public final double getValue() { return value; }
    public String getNodeId() { return nodeId; }


    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(GeneralNode upstream1) { this.upstream1 = upstream1; }
}
