package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Standard processing node: sums upstream values + 1.
 * Records itself in the DataCollector, then propagates iff its nodeId is active.
 * Used as the default node type in diamond-mesh layers.
 */
public class ValidationBaseNode extends ValidationNode {

    @OnTrigger
    public boolean onUpstream() {
        recordFiring();
        double v1 = upstream1 != null ? upstream1.value : 0.0;
        double v2 = upstream2 != null ? upstream2.value : 0.0;
        double v3 = upstream3 != null ? upstream3.value : 0.0;
        double v4 = upstream4 != null ? upstream4.value : 0.0;
        double v5 = upstream5 != null ? upstream5.value : 0.0;
        value = v1 + v2 + v3 + v4 + v5 + 1.0;
        return isIdPropagating();
    }
}
