package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class MultiEventPathNode {
    public double value;
    public MultiEventPathNode upstream1;

    @OnTrigger
    public boolean onUpstream() {
        value = (upstream1 != null ? upstream1.value : 0.0) + 1.0;
        return true;
    }

    public void setUpstream1(MultiEventPathNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
