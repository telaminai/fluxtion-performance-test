package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class IntermediateHandlersNode {
    public double value;
    public IntermediateHandlersNode upstream1;

    @OnTrigger
    public boolean onUpstream() {
        value = (upstream1 != null ? upstream1.value : 0.0) + 1.0;
        return true;
    }

    public void setUpstream1(IntermediateHandlersNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
