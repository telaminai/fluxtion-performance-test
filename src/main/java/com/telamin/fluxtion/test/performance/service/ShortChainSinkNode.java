package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class ShortChainSinkNode extends ShortChainNode {
    /** Volatile prevents dead-code elimination by the JIT. */
    public volatile double result;

    @Override
    @OnTrigger
    public boolean onUpstream() {
        result = (upstream1 != null ? upstream1.value : 0.0) + 1.0;
        value = result;
        return true;
    }
}
