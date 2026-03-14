package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Standard processing node: sums upstream values + 1.
 * Records itself in the DataCollector, then propagates iff its nodeId is active.
 * Used as the default node type in diamond-mesh layers.
 */
public class ValidationBaseNode extends ValidationNodeBase {

    @OnTrigger
    public boolean onUpstream() {
        recordFiring();
        double v1 = upstream1 != null ? upstream1.getValue() : 0.0;
        double v2 = upstream2 != null ? upstream2.getValue() : 0.0;
        value = v1 + v2 + 1.0;
        return isIdPropagating();
    }
}
