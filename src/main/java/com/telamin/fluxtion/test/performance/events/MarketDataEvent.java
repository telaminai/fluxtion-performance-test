package com.telamin.fluxtion.test.performance.events;

import com.telamin.fluxtion.runtime.event.Event;

/**
 * Represents a bid/ask price update for a given instrument.
 * Used by: deep_path, diamond_mesh, hot_path benchmarks.
 */
public class MarketDataEvent implements Event {
    private final String instrument;
    private final double bid;
    private final double ask;
    private final long sequenceNumber;

    public MarketDataEvent(String instrument, double bid, double ask, long sequenceNumber) {
        this.instrument = instrument;
        this.bid = bid;
        this.ask = ask;
        this.sequenceNumber = sequenceNumber;
    }

    public String getInstrument() { return instrument; }
    public double getBid() { return bid; }
    public double getAsk() { return ask; }
    public double getMid() { return (bid + ask) / 2.0; }
    public long getSequenceNumber() { return sequenceNumber; }

    @Override
    public String filterString() { return instrument; }

    @Override
    public String toString() {
        return "MarketDataEvent{instrument='" + instrument + "', bid=" + bid + ", ask=" + ask + ", seq=" + sequenceNumber + "}";
    }
}
