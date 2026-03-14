package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Terminal sink node — the final node in every chain of the validation diamond graph.
 *
 * Records itself in DataCollector and captures the upstream value into a volatile
 * field for JMH Blackhole consumption. Returns {@code false} — it is a terminal
 * node and never propagates further downstream.
 *
 * The volatile write ensures the JIT cannot eliminate the computation chain
 * (dead-code elimination prevention without requiring a Blackhole parameter).
 */
public class ValidationSinkNode extends ValidationNodeBase {

    private volatile long result;

    @OnTrigger
    public boolean onUpstream() {
        recordFiring();
        result = (long) (upstream1 != null ? upstream1.getValue() : 0.0);
        return false; // terminal — never propagates
    }

    /** Read by benchmarks to prevent dead-code elimination. */
    public long getResult() { return result; }
}
