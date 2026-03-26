package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.test.performance.events.ShortChainEvent;

/**
 * Service interface exported by the Fluxtion processor.
 * Allows strongly-typed dispatch by calling {@code processChain(event)} directly.
 */
public interface IShortChainProcessor {
    /**
     * Direct entry-point for the short-chain graph.
     * Bypasses the standard {@code onEvent(Object)} path.
     */
    boolean processChain(ShortChainEvent event);
}