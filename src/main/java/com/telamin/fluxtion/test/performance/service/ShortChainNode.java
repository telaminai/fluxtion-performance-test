package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class ShortChainNode {
    public double value;
    public ShortChainNode upstream1;
    public ShortChainNode upstream2;

    @OnTrigger
    public boolean onUpstream() {
        double v1 = upstream1 != null ? upstream1.value : 0.0;
        double v2 = upstream2 != null ? upstream2.value : 0.0;
        value = v1 + v2 + 1.0;
        return true;
    }

    public void setUpstream1(ShortChainNode u) { this.upstream1 = u; }
    public void setUpstream2(ShortChainNode u) { this.upstream2 = u; }
    public double getValue() { return value; }
}
