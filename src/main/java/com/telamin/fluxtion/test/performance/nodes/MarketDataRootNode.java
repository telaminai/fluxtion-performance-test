package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;

/**
 * Root event-handler node for MarketDataEvent.
 * Entry point for deep_path, diamond_mesh, and hot_path graphs.
 * Returns true to propagate the mid-price downstream.
 */
public class MarketDataRootNode implements ProcessingNode {
    private String nodeId = "marketDataRoot";
    private double mid;
    private long sequenceNumber;

    @OnEventHandler
    public boolean onMarketData(MarketDataEvent event) {
        mid = event.getMid();
        sequenceNumber = event.getSequenceNumber();
        return true;
    }

    @Override
    public double getValue() { return mid; }

    @Override
    public String getNodeId() { return nodeId; }

    public long getSequenceNumber() { return sequenceNumber; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
}
