package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.ControlEvent;

public class DirtyFilterControlRootNode extends DirtyFilterNode {
    @OnEventHandler
    public boolean onControl(ControlEvent event) {
        value = event.isEnabled() ? 1.0 : 0.0;
        return event.isEnabled();
    }
}
