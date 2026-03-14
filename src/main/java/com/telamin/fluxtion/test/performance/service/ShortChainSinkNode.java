package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Terminal sink for the short-chain service benchmark.
 * Writes the upstream result to a volatile field so the JIT cannot
 * eliminate the computation (acts as a lightweight Blackhole substitute).
 */
public class ShortChainSinkNode extends ShortChainNodeBase {
    private ShortChainNodeBase upstream1;
    /** Volatile prevents dead-code elimination by the JIT. */
    public volatile double result;

    @OnTrigger
    public boolean onUpstream() {
        result = upstream1 != null ? upstream1.getValue() + 1.0 : 1.0;
        return true;
    }

    @Override
    public double getValue() { return result; }

    public void setUpstream1(ShortChainNodeBase u)  { this.upstream1 = u; }
    public ShortChainNodeBase getUpstream1()        { return upstream1; }
}
