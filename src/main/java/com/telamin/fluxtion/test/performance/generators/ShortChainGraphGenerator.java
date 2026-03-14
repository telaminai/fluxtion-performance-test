package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a strictly linear chain for the @ExportService short-chain benchmark:
 *
 *   root (ShortChainRootNode / @ExportService IShortChainProcessor)
 *     -> node_1 (ShortChainNode)
 *     -> node_2 (ShortChainNode)
 *     -> ...
 *     -> node_size (ShortChainNode)
 *     -> sink (ShortChainSinkNode)
 *
 * Each intermediate node only sets upstream1; upstream2 is left null so this is
 * a pure linear chain — the shortest possible execution path to maximise the
 * visibility of dispatch overhead differences between:
 *   - Fluxtion onEvent(Object)   (standard)
 *   - Fluxtion @ExportService    (strongly-typed direct call)
 *   - RxJava Observable chain    (dynamic reactive)
 */
public class ShortChainGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.service.ShortChainRootNode");
        String nodeClass = param(p, "nodeClass",
                "com.telamin.fluxtion.test.performance.service.ShortChainNode");
        String sinkClass = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.service.ShortChainSinkNode");

        StringBuilder xml = new StringBuilder(xmlHeader());

        // Root — exports IShortChainProcessor service interface
        xml.append(rootBean("root", rootClass));

        // Linear chain of intermediate nodes (upstream1 only, upstream2 left null)
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
