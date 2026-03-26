package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;

/**
 * Root event-handler node for TradeSignalEvent.
 * Entry point for polymorphic and intermediate_handlers graphs.
 * Exposes signedQuantity so downstream nodes can act on direction.
 */
public class TradeSignalRootNode implements GeneralNode {
    private String nodeId = "tradeSignalRoot";
    private double value;
    private double signedQuantity;
    private double limitPrice;

    @OnEventHandler
    public boolean onTradeSignal(TradeSignalEvent event) {
        signedQuantity = event.signedQuantity();
        limitPrice = event.getLimitPrice();
        value = signedQuantity;
        return true;
    }

    @Override
    public final double getValue() { return value; }
    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
}
