package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class DirtyFilterBaseNode extends DirtyFilterNode {
    @OnTrigger
    public boolean onUpstream() {
        value = upstream1.value + 1.0;
        return true;
    }
}
