package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;

/**
 * Root event-handler node for MarketDataEvent.
 * Entry point for deep_path, diamond_mesh, and hot_path graphs.
 * Returns true to propagate the mid-price downstream.
 */
public class MarketDataRootNode implements PolymorphicNode, NoOpPathNode {
    private String nodeId = "marketDataRoot";
    private double value;
    private long sequenceNumber;

    @OnEventHandler
    public boolean onMarketData(MarketDataEvent event) {
        value = event.getMid();
        sequenceNumber = event.getSequenceNumber();
        return true;
    }

    @Override
    public final double getValue() { return value; }
    @Override
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
}
