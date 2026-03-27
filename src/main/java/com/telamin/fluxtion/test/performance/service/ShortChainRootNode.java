package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.ExportService;
import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.ShortChainEvent;

public class ShortChainRootNode extends ShortChainNode implements @ExportService IShortChainProcessor {
    private long lastSequence;

    @Override
    @OnEventHandler
    public boolean processChain(ShortChainEvent event) {
        value = event.getValue();
        lastSequence = event.getSequence();
        return true;
    }

    public long getSequence() { return lastSequence; }
}
