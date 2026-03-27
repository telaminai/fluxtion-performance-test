package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;

public class PolymorphicRootNode extends PolymorphicNode {
    @OnEventHandler
    public boolean onMarketData(MarketDataEvent event) {
        value = event.getMid();
        return true;
    }

    @OnEventHandler
    public boolean onTradeSignal(TradeSignalEvent event) {
        value = event.signedQuantity();
        return true;
    }
}
