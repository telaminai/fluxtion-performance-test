package com.telamin.fluxtion.test.performance.validation.nodes;

/**
 * Abstract base for all validation processing nodes.
 *
 * Every node in the validation diamond graph:
 *   1. Has a unique {@code nodeId} (set via Spring property injection).
 *   2. Holds a reference to the shared {@link EventContext} to read the current
 *      event's {@code activeIds} set.
 *   3. Holds a reference to the shared {@link DataCollector} to record that it fired.
 *
 * The {@link #isIdPropagating()} method is the central propagation-control mechanism:
 * it returns {@code true} iff this node's ID appears in the current event's activeIds.
 * Concrete subclasses call this at the END of their {@code @OnTrigger} method and
 * return its result. This makes the return value data-driven per event cycle.
 *
 * Subclasses demonstrate different computation styles (sum, accumulate, transform)
 * while sharing identical propagation-control semantics — proving that the mechanism
 * is polymorphic and works uniformly across the node hierarchy.
 */
public abstract class ValidationNodeBase {

    protected String nodeId = "unnamed";
    protected EventContext eventContext;
    protected DataCollector dataCollector;
    protected double value;

    // --- upstream dependencies (up to 2, matching the diamond fan-in factor) ---
    protected ValidationNodeBase upstream1;
    protected ValidationNodeBase upstream2;

    /** Returns true iff this node's ID is in the current event's active-ID set. */
    protected boolean isIdPropagating() {
        return eventContext != null && eventContext.isActive(nodeId);
    }

    /** Records that this node executed in the current event cycle. */
    protected void recordFiring() {
        if (dataCollector != null) dataCollector.record(nodeId);
    }

    public double getValue() { return value; }
    public String getNodeId() { return nodeId; }
    public EventContext getEventContext() { return eventContext; }
    public DataCollector getDataCollector() { return dataCollector; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setEventContext(EventContext eventContext) { this.eventContext = eventContext; }
    public void setDataCollector(DataCollector dataCollector) { this.dataCollector = dataCollector; }
    public void setUpstream1(ValidationNodeBase upstream1) { this.upstream1 = upstream1; }
    public void setUpstream2(ValidationNodeBase upstream2) { this.upstream2 = upstream2; }
    public ValidationNodeBase getUpstream1() { return upstream1; }
    public ValidationNodeBase getUpstream2() { return upstream2; }
}
