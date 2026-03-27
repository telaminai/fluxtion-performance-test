package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class PolymorphicPublisherNode {
    public PolymorphicNode upstream1;
    public double value;

    @OnTrigger
    public boolean onUpstream() {
        value = upstream1.value;
        return true;
    }

    public void setUpstream1(PolymorphicNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
