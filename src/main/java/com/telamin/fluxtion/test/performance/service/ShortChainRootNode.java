package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.ExportService;
import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.test.performance.events.ShortChainEvent;

/**
 * Entry-point node for the short-chain service benchmark.
 *
 * Implements {@code @ExportService IShortChainProcessor} so the generated AOT
 * processor also exports this interface.  This allows callers to bypass the
 * standard {@code onEvent(Object)} dispatch path and call
 * {@code processor.processChain(event)} directly for lower overhead.
 *
 * The node also carries a standard {@code @OnEventHandler} so the generated
 * processor's generic {@code onEvent(Object)} path still works — enabling a
 * direct A/B comparison of the two dispatch strategies in the benchmark.
 */
public class ShortChainRootNode extends ShortChainNodeBase implements @ExportService IShortChainProcessor {
    private double lastValue;
    private long   lastSequence;

    /**
     * Called via the {@code @ExportService} path:
     * {@code ((IShortChainProcessor) processor).processChain(event)}
     */
    @Override
    @OnEventHandler
    public boolean processChain(ShortChainEvent event) {
        lastValue    = event.getValue();
        lastSequence = event.getSequence();
        return true;
    }

    public double getValue()    { return lastValue; }
    public long   getSequence() { return lastSequence; }
}
