package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Polymorphic subclass of ValidationNodeBase: accumulates a running sum across cycles
 * rather than a per-cycle sum. Demonstrates that the ID-based propagation-control
 * mechanism is inherited and works uniformly across different computation strategies.
 *
 * Used in the trade-signal chain (medium depth) of the validation diamond graph.
 */
public class ValidationAccumulatorNode extends ValidationNode {

    private double accumulated = 0.0;

    @OnTrigger
    public boolean onUpstream() {
        recordFiring();
        double v1 = upstream1 != null ? upstream1.value : 0.0;
        double v2 = upstream2 != null ? upstream2.value : 0.0;
        double v3 = upstream3 != null ? upstream3.value : 0.0;
        double v4 = upstream4 != null ? upstream4.value : 0.0;
        double v5 = upstream5 != null ? upstream5.value : 0.0;
        accumulated += v1 + v2 + v3 + v4 + v5;
        value = accumulated;
        return isIdPropagating();
    }

    public void resetAccumulated() { accumulated = 0.0; }
    public double getAccumulated() { return accumulated; }
}
