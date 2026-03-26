package com.telamin.fluxtion.test.performance.nodes;

/**
 * Base class for all Fluxtion benchmark nodes.
 * Provides a final getValue() accessor to allow the JIT to perform
 * monomorphic inlining, eliminating all dispatch overhead.
 */
public abstract class PolymorphicNodeBase implements PolymorphicNode {
    protected double value;

    @Override
    public final double getValue() {
        return value;
    }

    @Override
    public abstract String getNodeId();

    public abstract void setNodeId(String nodeId);
}