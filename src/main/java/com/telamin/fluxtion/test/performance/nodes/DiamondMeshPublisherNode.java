package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Terminal sink for DiamondMesh chain.
 */
public class DiamondMeshPublisherNode {
    public DiamondMeshNode upstream1;
    public double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        value = upstream1.value;
        return true;
    }

    public void setUpstream1(DiamondMeshNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
