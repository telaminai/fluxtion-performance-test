package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.ControlEvent;

/**
 * Root event-handler node for ControlEvent.
 * Entry point for dirty_filter graphs.
 * Returns false (suppresses propagation) when command is DISABLE,
 * demonstrating Fluxtion's ability to arrest an entire sub-graph cheaply.
 */
public class ControlRootNode implements ProcessingNode {
    private String nodeId = "controlRoot";
    private boolean active = true;
    private double threshold = 0.0;

    @OnEventHandler
    public boolean onControl(ControlEvent event) {
        switch (event.getCommand()) {
            case ENABLE  -> active = true;
            case DISABLE -> active = false;
            case RESET   -> { active = true; threshold = event.getThreshold(); }
        }
        return active;   // false arrests all downstream nodes
    }

    @Override
    public double getValue() { return active ? 1.0 : 0.0; }

    @Override
    public String getNodeId() { return nodeId; }

    public boolean isActive() { return active; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
}
