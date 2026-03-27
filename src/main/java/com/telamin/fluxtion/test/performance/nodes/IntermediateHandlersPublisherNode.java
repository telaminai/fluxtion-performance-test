package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class IntermediateHandlersPublisherNode {
    public IntermediateHandlersNode upstream1;
    public double value;

    @OnTrigger
    public boolean onUpstream() {
        value = upstream1.value;
        return true;
    }

    public void setUpstream1(IntermediateHandlersNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
