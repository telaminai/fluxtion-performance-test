package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;

/**
 * Root node for DiamondMesh chain.
 */
public class DiamondMeshRootNode extends DiamondMeshNode {
    @OnEventHandler
    public boolean onMarketData(MarketDataEvent event) {
        value = event.getMid();
        return true;
    }
}
