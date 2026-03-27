package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.ControlEvent;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;

public class MultiEventPathRootNode extends MultiEventPathNode {
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

    @OnEventHandler
    public boolean onControl(ControlEvent event) {
        value = event.isEnabled() ? 1.0 : 0.0;
        return true;
    }
}
