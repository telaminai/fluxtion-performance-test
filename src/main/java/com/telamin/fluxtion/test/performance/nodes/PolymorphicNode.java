package com.telamin.fluxtion.test.performance.nodes;

/**
 * Marker interface for all benchmark processing nodes.
 * Provides a common getValue() accessor used by downstream nodes and the JMH blackhole.
 */
public interface PolymorphicNode {
    double getValue();
    String getNodeId();
}
