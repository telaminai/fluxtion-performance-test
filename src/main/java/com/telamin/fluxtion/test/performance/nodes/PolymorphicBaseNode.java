package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class PolymorphicBaseNode extends PolymorphicNode {
    @OnTrigger
    public boolean onUpstream() {
        double v1 = upstream1.value;
        double v2 = (upstream2 == null) ? 0.0 : upstream2.value;
        value = v1 + v2 + 1.0;
        return true;
    }
}
