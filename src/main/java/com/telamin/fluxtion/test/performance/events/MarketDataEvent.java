package com.telamin.fluxtion.test.performance.events;
import com.telamin.fluxtion.runtime.event.Event;
/**
 * Represents a bid/ask price update for a given instrument.
 * Used by: deep_path, diamond_mesh, hot_path, multi_event_path benchmarks.
 *
 * Fields are intentionally mutable so benchmark harnesses can pre-allocate
 * a single instance and update it in-place before each onEvent() call.
 * This is required to prove Fluxtion's zero-allocation property: when the
 * caller re-uses the same object the JMH GC profiler (-prof gc) reports
 * exactly 0 B/op for the Fluxtion path.
 */
public class MarketDataEvent implements Event {
    private String instrument;
    private double bid;
    private double ask;
    private long sequenceNumber;

    public MarketDataEvent(String instrument, double bid, double ask, long sequenceNumber) {
        this.instrument = instrument;
        this.bid = bid;
        this.ask = ask;
        this.sequenceNumber = sequenceNumber;
    }

    // Mutable update — allows object reuse in benchmarks
    public void update(String instrument, double bid, double ask, long sequenceNumber) {
        this.instrument = instrument;
        this.bid = bid;
        this.ask = ask;
        this.sequenceNumber = sequenceNumber;
    }

    public void setBid(double bid) { this.bid = bid; }
    public void setAsk(double ask) { this.ask = ask; }
    public void setSequenceNumber(long sequenceNumber) { this.sequenceNumber = sequenceNumber; }
    public void setInstrument(String instrument) { this.instrument = instrument; }

    public String getInstrument() { return instrument; }
    public double getBid() { return bid; }
    public double getAsk() { return ask; }
    public double getMid() { return (bid + ask) / 2.0; }
    public long getSequenceNumber() { return sequenceNumber; }

    @Override
    public String filterString() { return instrument; }

    @Override
    public String toString() {
        return "MarketDataEvent{instrument='" + instrument + "', bid=" + bid
                + ", ask=" + ask + ", seq=" + sequenceNumber + "}";
    }
}
