package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a Diamond Mesh graph:
 * - node_1 depends on root.
 * - node_i depends on node_{i-1} AND root.
 * - This creates a complex coordination problem with N levels of diamonds.
 * - RxJava must use zip() at every level to prevent multiple firings (glitches).
 */
public class DiamondMeshGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode");
        String nodeClass = param(p, "nodeClass",
                "com.telamin.fluxtion.test.performance.nodes.BaseNode");
        String sinkClass = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.DiamondPublisherNode");

        StringBuilder xml = new StringBuilder(xmlHeader());

        // Root
        xml.append(rootBean("root", rootClass));

        // Diamond chain
        String prevId = "root";
        for (int i = 1; i <= size; i++) {
            String id = "node_" + i;
            xml.append(bean(id, nodeClass, prevId, "root"));
            prevId = id;
        }

        // Sink
        xml.append(bean("sink", sinkClass, prevId));

        xml.append(xmlFooter());
        return xml.toString();
    }
}