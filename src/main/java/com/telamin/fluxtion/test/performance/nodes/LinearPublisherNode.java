package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class LinearPublisherNode implements DeepPathNode {
    private String nodeId = "publisher";
    private DeepPathNode upstream1;
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
    public void setUpstream1(DeepPathNode upstream1) { this.upstream1 = upstream1; }
    public long getPublishCount() { return publishCount; }
}