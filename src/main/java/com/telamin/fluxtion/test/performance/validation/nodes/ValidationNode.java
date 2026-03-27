package com.telamin.fluxtion.test.performance.validation.nodes;

public class ValidationNode {
    public double value;
    public String nodeId = "unnamed";
    public EventContext eventContext;
    public DataCollector dataCollector;

    public ValidationNode upstream1;
    public ValidationNode upstream2;
    public ValidationNode upstream3;
    public ValidationNode upstream4;
    public ValidationNode upstream5;

    protected boolean isIdPropagating() {
        return eventContext != null && eventContext.isActive(nodeId);
    }

    protected void recordFiring() {
        if (dataCollector != null) dataCollector.record(nodeId);
    }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setEventContext(EventContext eventContext) { this.eventContext = eventContext; }
    public void setDataCollector(DataCollector dataCollector) { this.dataCollector = dataCollector; }
    public void setUpstream1(ValidationNode upstream1) { this.upstream1 = upstream1; }
    public void setUpstream2(ValidationNode upstream2) { this.upstream2 = upstream2; }
    public void setUpstream3(ValidationNode upstream3) { this.upstream3 = upstream3; }
    public void setUpstream4(ValidationNode upstream4) { this.upstream4 = upstream4; }
    public void setUpstream5(ValidationNode upstream5) { this.upstream5 = upstream5; }
    public double getValue() { return value; }
}
