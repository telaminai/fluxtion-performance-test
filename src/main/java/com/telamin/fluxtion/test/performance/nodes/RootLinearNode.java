package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;

/**
 * Root node for DeepPath chain.
 * - Extends LinearNode.
 * - Accepts MarketDataEvent.
 */
public final class RootLinearNode extends LinearNode {
    
    @OnEventHandler
    public final boolean onMarketData(MarketDataEvent event) {
        value = event.getMid();
        return true;
    }
}