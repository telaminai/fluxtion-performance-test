package com.telamin.fluxtion.test.performance.generators;

import java.util.Map;

/**
 * Generates a fan-out graph with N branches from the root.
 *
 * Branch 0 ("hot path"): chain of AccumulatorNodes — always fires.
 * Branches 1..N-1 ("cold paths"): start with a FilteringNode whose threshold
 * is set astronomically high so it never passes, silencing all downstream nodes.
 *
 * Size = number of branches (fan-out factor).
 * hotBranchDepth / coldBranchDepth control chain lengths per branch.
 */
public class HotPathGraphGenerator extends GraphGeneratorBase {

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        Map<String, Object> p = config.getParams();
        String rootClass    = param(p, "rootNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode");
        String hotClass     = param(p, "hotNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.AccumulatorNode");
        String coldClass    = param(p, "coldNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.FilteringNode");
        String sinkClass    = param(p, "sinkNodeClass",
                "com.telamin.fluxtion.test.performance.nodes.PublisherNode");
        int hotDepth  = paramInt(p, "hotBranchDepth", 10);
        int coldDepth = paramInt(p, "coldBranchDepth", 5);
        double coldThreshold = paramDouble(p, "coldThreshold", 1.0e15);

        StringBuilder xml = new StringBuilder(xmlHeader());

        xml.append(rootBean("root", rootClass));

        // Hot branch (branch 0) — always propagates
        String prevHot = "root";
        for (int d = 0; d < hotDepth; d++) {
            String id = "hot_" + d;
            xml.append(bean(id, hotClass, prevHot));
            prevHot = id;
        }
        xml.append(bean("sink_hot", sinkClass, prevHot));

        // Cold branches — silenced by impossibly high threshold on the first node
        for (int b = 1; b < size; b++) {
            String filterId = "cold_" + b + "_filter";
            xml.append(beanWithDouble(filterId, coldClass, "root", "threshold", coldThreshold));
            String prevCold = filterId;
            for (int d = 0; d < coldDepth; d++) {
                String id = "cold_" + b + "_" + d;
                xml.append(bean(id, hotClass, prevCold));
                prevCold = id;
            }
            xml.append(bean("sink_cold_" + b, sinkClass, prevCold));
        }

        xml.append(xmlFooter());
        return xml.toString();
    }
}
