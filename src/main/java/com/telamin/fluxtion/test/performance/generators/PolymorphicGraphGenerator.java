package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a linear chain where nodes cycle through three concrete subtypes:
 *   BaseNode -> AccumulatorNode -> TransformNode -> BaseNode -> ...
 *
 * All three implement PolymorphicNode but have distinct @OnTrigger implementations.
 * This forces the JVM's call-site profiling into a megamorphic state in dynamic
 * frameworks, while Fluxtion's compiled SEG keeps every call-site monomorphic.
 *
 * Size = total number of intermediate nodes (excluding root and sink).
 */
public class PolymorphicGraphGenerator extends GraphGeneratorBase {

    private static final String[] NODE_TYPES = {
            "com.telamin.fluxtion.test.performance.nodes.BaseNode",
            "com.telamin.fluxtion.test.performance.nodes.AccumulatorNode",
            "com.telamin.fluxtion.test.performance.nodes.TransformNode"
    };

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass   = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.TradeSignalRootNode");
        String sinkClass   = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");
        double factor      = paramDouble(p, "transformFactor", 1.001);

        StringBuilder xml = new StringBuilder(xmlHeader());

        xml.append(rootBean("root", rootClass));

        String prevId = "root";
        for (int i = 1; i <= size; i++) {
            String id = "node_" + i;
            String nodeClass = NODE_TYPES[(i - 1) % NODE_TYPES.length];
            if (nodeClass.endsWith("TransformNode")) {
                // TransformNode needs a factor property
                xml.append(beanWithDouble(id, nodeClass, prevId, "factor", factor));
            } else {
                xml.append(bean(id, nodeClass, prevId));
            }
            prevId = id;
        }

        xml.append(bean("sink", sinkClass, prevId));
        xml.append(xmlFooter());
        return xml.toString();
    }
}
