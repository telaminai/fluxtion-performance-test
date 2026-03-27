package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent;

/**
 * Root event-handler for {@link ValidationMarketEvent}.
 *
 * On every event:
 *   1. Copies the event's {@code activeIds} into the shared {@link EventContext}
 *      so all downstream nodes can evaluate their propagation flag.
 *   2. Records itself in the shared {@link DataCollector}.
 *   3. Captures the mid-price as its output value.
 *   4. Returns {@code isIdPropagating()} — the root participates in the same
 *      ID-based control as every other node.
 */
public class ValidationMarketRootNode extends ValidationNode {

    @OnEventHandler
    public boolean onMarketEvent(ValidationMarketEvent event) {
        if (eventContext != null) eventContext.setActiveIds(event.getActiveIds());
        recordFiring();
        value = event.getMid();
        return isIdPropagating();
    }
}
