package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;

/**
 * Root event-handler node for TradeSignalEvent.
 * Entry point for polymorphic and intermediate_handlers graphs.
 * Exposes signedQuantity so downstream nodes can act on direction.
 */
public class TradeSignalRootNode implements ProcessingNode {
    private String nodeId = "tradeSignalRoot";
    private double signedQuantity;
    private double limitPrice;

    @OnEventHandler
    public boolean onTradeSignal(TradeSignalEvent event) {
        signedQuantity = event.signedQuantity();
        limitPrice = event.getLimitPrice();
        return true;
    }

    @Override
    public double getValue() { return signedQuantity; }

    @Override
    public String getNodeId() { return nodeId; }

    public double getLimitPrice() { return limitPrice; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
}
