package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a linear chain where a new TradeSignalRootNode (an @OnEventHandler
 * for TradeSignalEvent) is inserted at every handlerEveryNLayers-th position,
 * replacing a plain BaseNode. The downstream node connects to the intermediate
 * handler rather than the previous node, creating multiple independent event
 * entry points within the same graph.
 *
 * Layout (handlerEveryNLayers=5, size=20):
 *   root(handler) -> n1 -> n2 -> n3 -> n4 ->
 *   midHandler5(handler) -> n6 -> n7 -> n8 -> n9 ->
 *   midHandler10(handler) -> ... -> sink
 *
 * Fluxtion compiles a separate execution path per entry point and merges them
 * in correct rank order. Dynamic frameworks scan all registered handlers linearly.
 *
 * Size = total chain length (excluding sink).
 */
public class IntermediateHandlersGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass      = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.TradeSignalRootNode");
        String midHandlerClass = param(p, "midHandlerNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.TradeSignalRootNode");
        String baseClass      = param(p, "baseNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.BaseNode");
        String sinkClass      = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");
        int handlerEveryN     = paramInt(p, "handlerEveryNLayers", 5);

        StringBuilder xml = new StringBuilder(xmlHeader());

        // Root handler — no upstream
        xml.append(rootBean("root", rootClass));

        String prevId = "root";
        for (int i = 1; i <= size; i++) {
            String id = "node_" + i;
            if (i % handlerEveryN == 0) {
                // Intermediate event handler — also a root (no upstream property);
                // downstream nodes will reference this id as their upstream
                xml.append(rootBean(id, midHandlerClass));
            } else {
                xml.append(bean(id, baseClass, prevId));
            }
            prevId = id;
        }

        xml.append(bean("sink", sinkClass, prevId));
        xml.append(xmlFooter());
        return xml.toString();
    }
}
