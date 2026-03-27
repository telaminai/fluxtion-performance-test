package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Sink for DeepPath chain.
 * - Reference to concrete LinearNode.
 */
public class LinearNodePublisher {
    public LinearNode upstream1;
    public double value;
    private long publishCount;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.value;
        publishCount++;
        return true;
    }

    public void setNodeId(String nodeId) { }
    public void setUpstream1(LinearNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
    public long getPublishCount() { return publishCount; }
}