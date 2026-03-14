package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Terminal node — collects the final output of a processing chain.
 * Its getValue() is consumed by the JMH Blackhole to prevent dead-code elimination.
 * Always propagates (terminal nodes should not suppress).
 * Used in: all benchmark dimensions as the sink node.
 */
public class PublisherNode implements ProcessingNode {
    private String nodeId = "publisher";
    private ProcessingNode upstream1;
    private double value;
    private long publishCount;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1 == null ? 0.0 : upstream1.getValue();
        publishCount++;
        return true;
    }

    @Override
    public double getValue() { return value; }

    @Override
    public String getNodeId() { return nodeId; }

    public long getPublishCount() { return publishCount; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(ProcessingNode upstream1) { this.upstream1 = upstream1; }
    public ProcessingNode getUpstream1() { return upstream1; }
}
