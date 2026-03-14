package com.telamin.fluxtion.test.performance.validation.events;

import java.util.Set;

/**
 * Trade signal event carrying side + quantity payload.
 * Routes through the TradeSignal chain in the validation diamond graph,
 * which is intentionally shallower than the MarketData chain to
 * demonstrate event-path specialisation (event bias).
 */
public class ValidationTradeEvent extends ValidationEvent {

    public enum Side { BUY, SELL }

    private String instrument;
    private Side side;
    private double quantity;
    private double limitPrice;

    public ValidationTradeEvent() {}

    public ValidationTradeEvent(Set<String> activeIds, long seq,
                                String instrument, Side side, double quantity, double limitPrice) {
        super(activeIds, seq);
        this.instrument = instrument;
        this.side = side;
        this.quantity = quantity;
        this.limitPrice = limitPrice;
    }

    public void update(Set<String> activeIds, long seq,
                       String instrument, Side side, double quantity, double limitPrice) {
        super.update(activeIds, seq);
        this.instrument = instrument;
        this.side = side;
        this.quantity = quantity;
        this.limitPrice = limitPrice;
    }

    public String getInstrument() { return instrument; }
    public Side getSide() { return side; }
    public double getQuantity() { return quantity; }
    public double getLimitPrice() { return limitPrice; }
    public void setInstrument(String instrument) { this.instrument = instrument; }
    public void setSide(Side side) { this.side = side; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
    public void setLimitPrice(double limitPrice) { this.limitPrice = limitPrice; }
}
