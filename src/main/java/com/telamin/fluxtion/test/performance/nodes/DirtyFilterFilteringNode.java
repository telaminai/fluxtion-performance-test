package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class DirtyFilterFilteringNode extends DirtyFilterNode {
    @OnTrigger
    public boolean onUpstream() {
        if (upstream1.value > 0.5) {
            value = upstream1.value;
            return true;
        }
        return false;
    }
}
