package com.telamin.fluxtion.test.performance.validation.events;

import java.util.Set;

/**
 * Market data event carrying bid/ask price payload.
 * Routes through the MarketData chain in the validation diamond graph.
 * Pre-allocatable: use {@link #update} to mutate in place between benchmark iterations.
 */
public class ValidationMarketEvent extends ValidationEvent {

    private String instrument;
    private double bid;
    private double ask;

    public ValidationMarketEvent() {}

    public ValidationMarketEvent(Set<String> activeIds, long seq, String instrument, double bid, double ask) {
        super(activeIds, seq);
        this.instrument = instrument;
        this.bid = bid;
        this.ask = ask;
    }

    public void update(Set<String> activeIds, long seq, String instrument, double bid, double ask) {
        super.update(activeIds, seq);
        this.instrument = instrument;
        this.bid = bid;
        this.ask = ask;
    }

    public double getMid() { return (bid + ask) / 2.0; }
    public String getInstrument() { return instrument; }
    public double getBid() { return bid; }
    public double getAsk() { return ask; }
    public void setInstrument(String instrument) { this.instrument = instrument; }
    public void setBid(double bid) { this.bid = bid; }
    public void setAsk(double ask) { this.ask = ask; }
}
