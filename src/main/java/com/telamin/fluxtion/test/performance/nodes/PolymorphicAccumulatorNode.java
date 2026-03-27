package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class PolymorphicAccumulatorNode extends PolymorphicNode {
    @OnTrigger
    public boolean onUpstream() {
        value += upstream1.value;
        return true;
    }
}
