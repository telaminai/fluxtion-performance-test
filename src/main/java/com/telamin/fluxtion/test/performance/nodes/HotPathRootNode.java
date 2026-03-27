package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;

public class HotPathRootNode extends HotPathNode {
    @OnEventHandler
    public boolean onMarketData(MarketDataEvent event) {
        value = event.getMid();
        return true;
    }
}
