package com.telamin.fluxtion.test.performance.events;

import com.telamin.fluxtion.runtime.event.Event;

/**
 * Minimal mutable event for the @ExportService short-chain benchmark.
 *
 * Mutable so the benchmark harness can pre-allocate a single instance and
 * call update() before each dispatch — proving zero-allocation for the
 * Fluxtion service path.
 */
public class ShortChainEvent implements Event {
    private double value;
    private long sequence;

    public ShortChainEvent(double value, long sequence) {
        this.value = value;
        this.sequence = sequence;
    }

    public void update(double value, long sequence) {
        this.value = value;
        this.sequence = sequence;
    }

    public double getValue()    { return value; }
    public long   getSequence() { return sequence; }
    public void   setValue(double value)      { this.value = value; }
    public void   setSequence(long sequence)  { this.sequence = sequence; }

    @Override
    public String toString() {
        return "ShortChainEvent{value=" + value + ", seq=" + sequence + "}";
    }
}
