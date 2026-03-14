package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a strictly linear chain:
 *
 *   root -> node_1 -> node_2 -> ... -> node_(size-1) -> sink
 *
 * Each intermediate node has a single upstream1 reference.
 * Size = total number of intermediate BaseNodes (excluding root and sink).
 */
public class DeepPathGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode");
        String nodeClass  = param(p, "nodeClass",
                "com.telamin.fluxtion.test.performance.nodes.BaseNode");
        String sinkClass  = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");

        StringBuilder xml = new StringBuilder(xmlHeader());

        // Root
        xml.append(rootBean("root", rootClass));

        // Linear chain
        String prevId = "root";
        for (int i = 1; i <= size; i++) {
            String id = "node_" + i;
            xml.append(bean(id, nodeClass, prevId));
            prevId = id;
        }

        // Sink
        xml.append(bean("sink", sinkClass, prevId));

        xml.append(xmlFooter());
        return xml.toString();
    }
}
