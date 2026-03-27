package com.telamin.fluxtion.test.performance.nodes;

/**
 * Base class for polymorphic benchmark.
 * Demonstrates megamorphic call-sites.
 */
public class PolymorphicNode {
    public double value;
    public PolymorphicNode upstream1;
    public PolymorphicNode upstream2;

    public void setNodeId(String nodeId) { }
    public double getValue() { return value; }
    public void setUpstream1(PolymorphicNode upstream1) { this.upstream1 = upstream1; }
    public void setUpstream2(PolymorphicNode upstream2) { this.upstream2 = upstream2; }
}
