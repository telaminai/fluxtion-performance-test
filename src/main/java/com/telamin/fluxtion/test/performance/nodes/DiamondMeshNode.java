package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Concrete node for DiamondMesh benchmark.
 * - NO INTERFACE.
 * - Direct field access to concrete DiamondMeshNode type.
 */
public class DiamondMeshNode {
    public double value;
    public DiamondMeshNode upstream1;
    public DiamondMeshNode upstream2;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        double v1 = upstream1.value;
        double v2 = (upstream2 == null) ? 0.0 : upstream2.value;
        value = v1 + v2 + 1.0;
        return true;
    }

    public void setNodeId(String nodeId) { }
    public double getValue() { return value; }
    public void setUpstream1(DiamondMeshNode upstream1) { this.upstream1 = upstream1; }
    public void setUpstream2(DiamondMeshNode upstream2) { this.upstream2 = upstream2; }
}
