package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class PolymorphicTransformNode extends PolymorphicNode {
    private double factor = 1.0;

    @OnTrigger
    public boolean onUpstream() {
        value = upstream1.value * factor;
        return true;
    }

    public void setFactor(double factor) { this.factor = factor; }
}
