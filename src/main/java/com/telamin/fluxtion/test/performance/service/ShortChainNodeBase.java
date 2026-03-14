package com.telamin.fluxtion.test.performance.service;

/**
 * Common parent for all nodes in the short-chain service benchmark.
 * Provides a typed getValue() so downstream nodes can depend on the
 * same field type whether the upstream is a root or an intermediate node.
 */
public abstract class ShortChainNodeBase {
    public abstract double getValue();
}
