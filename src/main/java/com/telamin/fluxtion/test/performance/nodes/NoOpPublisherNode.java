package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Sink for No-Op chain.
 * NO INHERITANCE.
 */
public class NoOpPublisherNode {
    public NoOpNode upstream1;
    public double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.value;
        return true;
    }

    public void setUpstream1(NoOpNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}