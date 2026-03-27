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
public class ValidationSinkNode extends ValidationNode {

    private volatile long result;

    @OnTrigger
    public boolean onUpstream() {
        recordFiring();
        double v1 = upstream1 != null ? upstream1.value : 0.0;
        double v2 = upstream2 != null ? upstream2.value : 0.0;
        double v3 = upstream3 != null ? upstream3.value : 0.0;
        double v4 = upstream4 != null ? upstream4.value : 0.0;
        double v5 = upstream5 != null ? upstream5.value : 0.0;
        result = (long) (v1 + v2 + v3 + v4 + v5);
        return false; // terminal — never propagates
    }

    /** Read by benchmarks to prevent dead-code elimination. */
    public long getResult() { return result; }
}
