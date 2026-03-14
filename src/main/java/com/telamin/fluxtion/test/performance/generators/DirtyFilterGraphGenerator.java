package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a chain where every Nth node is a FilteringNode.
 * The FilteringNode threshold is set to activeThreshold so that only events
 * with a value above it propagate further — in practice the ControlRootNode
 * returns false for DISABLE commands, arresting the whole graph.
 *
 * Layout (filterEveryN=3):
 *   root -> base_1 -> base_2 -> filter_3 -> base_4 -> base_5 -> filter_6 -> ... -> sink
 *
 * Size = total intermediate nodes (base + filter, excluding root and sink).
 */
public class DirtyFilterGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass   = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.ControlRootNode");
        String baseClass   = param(p, "baseNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.BaseNode");
        String filterClass = param(p, "filterNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.FilteringNode");
        String sinkClass   = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");
        int filterEveryN   = paramInt(p, "filterEveryN", 3);
        double threshold   = paramDouble(p, "activeThreshold", 0.5);

        StringBuilder xml = new StringBuilder(xmlHeader());

        xml.append(rootBean("root", rootClass));

        String prevId = "root";
        for (int i = 1; i <= size; i++) {
            String id = "node_" + i;
            if (i % filterEveryN == 0) {
                xml.append(beanWithDouble(id, filterClass, prevId, "threshold", threshold));
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
