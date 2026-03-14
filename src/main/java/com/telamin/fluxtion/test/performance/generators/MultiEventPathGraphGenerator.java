package com.telamin.fluxtion.test.performance.generators;
import java.util.Map;
/**
 * Generates a graph with three completely independent linear chains,
 * one per event type, with BIASED depths to demonstrate event-path specialisation:
 *
 *   MarketDataRootNode  -> BaseNode x size             -> PublisherNode (md_sink)
 *   TradeSignalRootNode -> AccumulatorNode x (size/2)  -> PublisherNode (ts_sink)
 *   ControlRootNode     -> FilteringNode x max(1,size/4)-> PublisherNode (ctrl_sink)
 *
 * All three chains live in the same Spring context and are therefore compiled
 * into a single Fluxtion processor. The compiler derives three independent
 * handleEvent() overloads — one per event type — so dispatching a
 * MarketDataEvent never touches the TradeSignal or Control chains.
 *
 * The biased depths are the key insight for Section 5 "event bias":
 *   - MarketDataEvent (hot, high-frequency) gets the full chain depth.
 *   - TradeSignalEvent (medium) gets half the depth — half the latency.
 *   - ControlEvent (rare, low-latency requirement) gets a short chain.
 *   Each event type's execution cost is proportional to its actual work.
 *   Fluxtion compiles a completely independent dispatch method per event type,
 *   so a ControlEvent never pays the cost of the MarketData chain.
 *
 * This topology directly demonstrates:
 *   1. Multi-event-type dispatch with zero instanceof overhead.
 *   2. Complete path isolation: unrelated chains are structurally invisible
 *      to each other's dispatch routines.
 *   3. Zero allocation: with pre-allocated mutable events the Fluxtion path
 *      reports 0 B/op under JMH -prof gc.
 *   4. Event bias: short-path events are proportionally cheaper.
 *
 * size = base depth — MarketData chain length; TradeSignal = size/2; Control = max(1, size/4).
 */
public class MultiEventPathGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();

        String mdRoot   = param(p, "marketDataRootClass",
                "com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode");
        String tsRoot   = param(p, "tradeSignalRootClass",
                "com.telamin.fluxtion.test.performance.nodes.TradeSignalRootNode");
        String ctrlRoot = param(p, "controlRootClass",
                "com.telamin.fluxtion.test.performance.nodes.ControlRootNode");

        String mdNode   = param(p, "marketDataNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.BaseNode");
        String tsNode   = param(p, "tradeSignalNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.AccumulatorNode");
        String ctrlNode = param(p, "controlNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.FilteringNode");

        String sinkClass = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");

        // Biased chain depths: hot path gets full size, cooler paths are shorter
        int mdSize   = size;
        int tsSize   = Math.max(1, size / 2);
        int ctrlSize = Math.max(1, size / 4);

        StringBuilder xml = new StringBuilder(xmlHeader());

        // --- Market data chain (full depth = size) ---
        xml.append("\n  <!-- === Market Data chain (MarketDataEvent -> BaseNode x ")
           .append(mdSize).append(") === -->\n");
        xml.append(rootBean("md_root", mdRoot));
        String prev = "md_root";
        for (int i = 1; i <= mdSize; i++) {
            String id = "md_" + i;
            xml.append(bean(id, mdNode, prev));
            prev = id;
        }
        xml.append(bean("md_sink", sinkClass, prev));

        // --- Trade signal chain (half depth = size/2) ---
        xml.append("\n  <!-- === Trade Signal chain (TradeSignalEvent -> AccumulatorNode x ")
           .append(tsSize).append(") === -->\n");
        xml.append(rootBean("ts_root", tsRoot));
        prev = "ts_root";
        for (int i = 1; i <= tsSize; i++) {
            String id = "ts_" + i;
            xml.append(bean(id, tsNode, prev));
            prev = id;
        }
        xml.append(bean("ts_sink", sinkClass, prev));

        // --- Control chain (quarter depth = max(1, size/4)) ---
        xml.append("\n  <!-- === Control chain (ControlEvent -> FilteringNode x ")
           .append(ctrlSize).append(") === -->\n");
        xml.append(rootBean("ctrl_root", ctrlRoot));
        prev = "ctrl_root";
        for (int i = 1; i <= ctrlSize; i++) {
            String id = "ctrl_" + i;
            xml.append(bean(id, ctrlNode, prev));
            prev = id;
        }
        xml.append(bean("ctrl_sink", sinkClass, prev));

        xml.append(xmlFooter());
        return xml.toString();
    }
}
