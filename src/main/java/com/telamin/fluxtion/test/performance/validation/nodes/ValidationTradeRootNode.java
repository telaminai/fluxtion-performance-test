package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent;

/**
 * Root event-handler for {@link ValidationTradeEvent}.
 * Publishes activeIds to EventContext and captures quantity as its output value.
 * Fluxtion compiles a completely separate dispatch path for this event type —
 * firing a ValidationTradeEvent never touches the market or control chains.
 */
public class ValidationTradeRootNode extends ValidationNode {

    @OnEventHandler
    public boolean onTradeEvent(ValidationTradeEvent event) {
        if (eventContext != null) eventContext.setActiveIds(event.getActiveIds());
        recordFiring();
        value = event.getQuantity();
        return isIdPropagating();
    }
}
