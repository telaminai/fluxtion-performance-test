package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.test.performance.events.ShortChainEvent;

/**
 * Service interface exported by the Fluxtion AOT processor.
 *
 * When a node implements {@code @ExportService IShortChainProcessor}, the generated
 * processor class also implements this interface.  The benchmark can then cast the
 * processor and call {@link #processChain(ShortChainEvent)} directly — bypassing the
 * {@code onEvent(Object)} dispatch path (no instanceof chain / type-switch lookup).
 *
 * <h3>Dispatch paths compared in ServiceDispatchBenchmark</h3>
 * <pre>
 *   Standard:  processor.onEvent(event)
 *                → onEventInternal(Object) → instanceof ShortChainEvent
 *                → handler dispatch → node chain
 *
 *   @ExportService: ((IShortChainProcessor) processor).processChain(event)
 *                → directly into the generated inline chain
 *                → no type lookup, no boxing
 * </pre>
 *
 * For very short chains (3–10 nodes) the dispatch overhead is a significant fraction
 * of total execution time, so the service path can show a measurable speedup.
 */
public interface IShortChainProcessor {
    /**
     * Directly triggers the short chain with the supplied event.
     * Returns {@code true} if the chain propagated to the sink.
     */
    boolean processChain(ShortChainEvent event);
}
