package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class DiamondPublisherNode implements DiamondMeshNode {
    private String nodeId = "publisher";
    private DiamondMeshNode upstream1;
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
    public void setUpstream1(DiamondMeshNode upstream1) { this.upstream1 = upstream1; }
    public long getPublishCount() { return publishCount; }
}