package com.telamin.fluxtion.test.performance.validation.events;

import com.telamin.fluxtion.runtime.event.Event;

import java.util.Collections;
import java.util.Set;

/**
 * Base class for all validation events.
 *
 * The key field is {@code activeIds}: a set of node IDs that are "active" for this
 * event cycle. Each processing node checks whether its own ID appears in this set
 * and returns {@code true} (propagate) or {@code false} (arrest) accordingly.
 *
 * This mechanism drives two distinct validation dimensions:
 *   1. <b>Full propagation</b>  – activeIds contains every node ID → the entire graph fires,
 *      each node exactly once (proves glitch-free rank-ordered execution).
 *   2. <b>Selective propagation</b> – activeIds is a strict subset → only the named nodes
 *      fire, their downstream is automatically arrested (proves selective sub-graph pruning).
 *
 * Subclasses add domain-specific payload (price data, trade data, control commands).
 * All three subclasses inherit this base so Fluxtion can compile independent dispatch
 * methods per concrete type while sharing the propagation-control logic.
 */
public abstract class ValidationEvent implements Event {

    /** Nodes whose IDs appear here are permitted to propagate during this event cycle. */
    private Set<String> activeIds = Collections.emptySet();

    private long sequenceNumber;

    protected ValidationEvent() {}

    protected ValidationEvent(Set<String> activeIds, long sequenceNumber) {
        this.activeIds = activeIds;
        this.sequenceNumber = sequenceNumber;
    }

    /** The set of node IDs that should propagate during this event cycle. */
    public Set<String> getActiveIds() { return activeIds; }

    public long getSequenceNumber() { return sequenceNumber; }

    /** Mutable update — allows benchmark harnesses to reuse a pre-allocated instance. */
    public void update(Set<String> activeIds, long sequenceNumber) {
        this.activeIds = activeIds;
        this.sequenceNumber = sequenceNumber;
    }

    public void setActiveIds(Set<String> activeIds) { this.activeIds = activeIds; }
    public void setSequenceNumber(long sequenceNumber) { this.sequenceNumber = sequenceNumber; }
}
