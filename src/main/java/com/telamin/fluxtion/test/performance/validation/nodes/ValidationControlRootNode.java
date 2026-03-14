package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent;

/**
 * Root event-handler for {@link ValidationControlEvent}.
 * Publishes activeIds to EventContext and captures the threshold as its output value.
 * Routes through the shortest chain (max(1, size/4)) — administrative, low-frequency.
 */
public class ValidationControlRootNode extends ValidationNodeBase {

    @OnEventHandler
    public boolean onControlEvent(ValidationControlEvent event) {
        if (eventContext != null) eventContext.setActiveIds(event.getActiveIds());
        recordFiring();
        value = event.getThreshold();
        return isIdPropagating();
    }
}
