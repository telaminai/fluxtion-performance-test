package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.Initialise;
import com.telamin.fluxtion.runtime.annotations.builder.FluxtionIgnore;
import java.util.Collections;
import java.util.Set;

/**
 * Shared context object injected into every node in the validation graph.
 *
 * When the root event-handler fires it copies the event's {@code activeIds} here.
 * All downstream nodes then read from this context in their {@code @OnTrigger}
 * method to decide whether to propagate ({@code isIdPropagating()}).
 *
 * This is a plain Spring bean — no Fluxtion annotations — so it acts as a
 * passive data-carrier that the compiler wires into every node via property injection.
 */
public class EventContext {

    @FluxtionIgnore
    private Set<String> activeIds = Collections.emptySet();

    /** Called by Fluxtion lifecycle to make this a proper graph participant (enables wiring). */
    @Initialise
    public void onInit() { /* no-op — activeIds initialised at field declaration */ }

    /** Called by root handlers to publish the current event's active-ID set. */
    public void setActiveIds(Set<String> activeIds) {
        this.activeIds = activeIds == null ? Collections.emptySet() : activeIds;
    }

    /** Read by every node to decide propagation. */
    public Set<String> getActiveIds() { return activeIds; }

    /** Returns true when {@code nodeId} is in the current active-ID set. */
    public boolean isActive(String nodeId) { return activeIds.contains(nodeId); }
}
