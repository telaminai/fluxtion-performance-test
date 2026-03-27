package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class HotPathNode {
    public double value;
    public HotPathNode upstream1;

    public void setUpstream1(HotPathNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
