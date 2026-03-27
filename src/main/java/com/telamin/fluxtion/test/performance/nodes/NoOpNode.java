package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * No-Op node to measure pure dispatch overhead.
 * NO INHERITANCE.
 */
public class NoOpNode {
    public double value;
    public NoOpNode upstream1;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.value;
        return true;
    }

    public void setNodeId(String nodeId) { }
    public void setUpstream1(NoOpNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}