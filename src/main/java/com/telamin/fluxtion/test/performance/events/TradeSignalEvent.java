package com.telamin.fluxtion.test.performance.events;

import com.telamin.fluxtion.runtime.event.Event;

/**
 * Represents a buy/sell instruction with quantity.
 * Used by: polymorphic, intermediate_handlers benchmarks.
 */
public class TradeSignalEvent implements Event {
    public enum Side { BUY, SELL }

    private final String instrument;
    private final Side side;
    private final double quantity;
    private final double limitPrice;

    public TradeSignalEvent(String instrument, Side side, double quantity, double limitPrice) {
        this.instrument = instrument;
        this.side = side;
        this.quantity = quantity;
        this.limitPrice = limitPrice;
    }

    public String getInstrument() { return instrument; }
    public Side getSide() { return side; }
    public double getQuantity() { return quantity; }
    public double getLimitPrice() { return limitPrice; }
    public double signedQuantity() { return side == Side.BUY ? quantity : -quantity; }

    @Override
    public String filterString() { return instrument; }

    @Override
    public String toString() {
        return "TradeSignalEvent{instrument='" + instrument + "', side=" + side
                + ", qty=" + quantity + ", limit=" + limitPrice + "}";
    }
}
