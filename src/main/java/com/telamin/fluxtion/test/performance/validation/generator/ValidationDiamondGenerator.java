package com.telamin.fluxtion.test.performance.validation.generator;

import com.telamin.fluxtion.test.performance.generators.BenchmarkConfig;
import com.telamin.fluxtion.test.performance.generators.GraphGeneratorBase;

import java.util.Map;

/**
 * Generates a Spring XML graph for the validation diamond mesh.
 *
 * <h3>Topology</h3>
 * Three completely independent diamond chains live in the same Spring context,
 * one per validation event type:
 * <pre>
 *   ValidationMarketRootNode  -> diamond(layers=size,       npl=3) -> ValidationSinkNode (md_sink)
 *   ValidationTradeRootNode   -> diamond(layers=size/2,     npl=3) -> ValidationSinkNode (ts_sink)
 *   ValidationControlRootNode -> diamond(layers=max(2,sz/3),npl=3) -> ValidationSinkNode (ctrl_sink)
 * </pre>
 * Every node gets the shared {@code eventContext} and {@code dataCollector} beans injected.
 *
 * <h3>Diamond join pattern</h3>
 * In each layer {@code l}, node {@code n} depends on:
 *   upstream1 = node (l-1, n % npl)
 *   upstream2 = node (l-1, (n+1) % npl)
 * This creates overlapping fan-in ("the diamond problem") that Fluxtion resolves
 * glitch-free via rank-ordered execution.
 *
 * <h3>Node type alternation (polymorphism)</h3>
 * Odd layers use ValidationBaseNode (sum + 1).
 * Even layers use ValidationAccumulatorNode (running sum).
 * This proves ID-based propagation-control works uniformly across subclasses.
 */
public class ValidationDiamondGenerator extends GraphGeneratorBase {

    private static final int NODES_PER_LAYER = 3;

    private static final String BASE_NODE  =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationBaseNode";
    private static final String ACCUM_NODE =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationAccumulatorNode";
    private static final String SINK_NODE  =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationSinkNode";
    private static final String MD_ROOT    =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationMarketRootNode";
    private static final String TS_ROOT    =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationTradeRootNode";
    private static final String CTRL_ROOT  =
            "com.telamin.fluxtion.test.performance.validation.nodes.ValidationControlRootNode";
    private static final String EC_CLASS   =
            "com.telamin.fluxtion.test.performance.validation.nodes.EventContext";
    private static final String DC_CLASS   =
            "com.telamin.fluxtion.test.performance.validation.nodes.DataCollector";

    @Override
    protected String generateXml(BenchmarkConfig config, int size) {
        int mdLayers   = Math.max(2, size);
        int tsLayers   = Math.max(2, size / 2);
        int ctrlLayers = Math.max(2, size / 3);

        StringBuilder xml = new StringBuilder();
        xml.append(xmlHeader());

        // Shared infrastructure beans
        xml.append("\n  <!-- shared infrastructure -->\n");
        xml.append("  <bean id=\"eventContext\" class=\"").append(EC_CLASS).append("\"/>\n");
        xml.append("  <bean id=\"dataCollector\" class=\"").append(DC_CLASS).append("\"/>\n");

        // Three independent diamond chains
        xml.append(buildChain("md",   MD_ROOT,   mdLayers,   NODES_PER_LAYER, "md_sink"));
        xml.append(buildChain("ts",   TS_ROOT,   tsLayers,   NODES_PER_LAYER, "ts_sink"));
        xml.append(buildChain("ctrl", CTRL_ROOT, ctrlLayers, NODES_PER_LAYER, "ctrl_sink"));

        xml.append(xmlFooter());
        return xml.toString();
    }

    /**
     * Builds one complete diamond chain and returns the XML fragment.
     *
     * @param prefix    bean ID prefix ("md", "ts", "ctrl")
     * @param rootClass fully-qualified root handler class name
     * @param layers    number of hidden layers
     * @param npl       nodes per hidden layer
     * @param sinkId    bean ID for the terminal sink node
     */
    private static String buildChain(String prefix, String rootClass,
                                     int layers, int npl, String sinkId) {
        StringBuilder sb = new StringBuilder();
        String chainLabel = prefix.equals("md") ? "MarketData"
                          : prefix.equals("ts") ? "TradeSignal" : "Control";
        sb.append("\n  <!-- === ").append(chainLabel)
          .append(" chain: root -> ").append(layers)
          .append(" layers x ").append(npl).append(" nodes/layer -> sink === -->\n");

        // Root
        String rootId = prefix + "_root";
        sb.append(validationBean(rootId, rootClass, rootId, null, null));

        // Hidden layers — track IDs per layer for diamond wiring
        String[][] ids = new String[layers + 1][npl];
        for (int n = 0; n < npl; n++) ids[0][n] = rootId;

        for (int l = 1; l <= layers; l++) {
            for (int n = 0; n < npl; n++) {
                String id  = prefix + "_l" + l + "_n" + n;
                String up1 = ids[l - 1][n % npl];
                String up2 = ids[l - 1][(n + 1) % npl];
                String cls = (l % 2 == 1) ? BASE_NODE : ACCUM_NODE;
                sb.append(validationBean(id, cls, id, up1, up2));
                ids[l][n] = id;
            }
        }

        // Sink depends on last-layer node 0
        sb.append(validationBean(sinkId, SINK_NODE, sinkId, ids[layers][0], null));
        return sb.toString();
    }

    /**
     * Generates a single bean element with nodeId, eventContext, dataCollector,
     * and optional upstream1/upstream2 property refs.
     */
    private static String validationBean(String id, String cls, String nodeId,
                                         String up1, String up2) {
        StringBuilder sb = new StringBuilder();
        sb.append("  <bean id=\"").append(id).append("\" class=\"").append(cls).append("\">\n");
        sb.append("    <property name=\"nodeId\" value=\"").append(nodeId).append("\"/>\n");
        sb.append("    <property name=\"eventContext\" ref=\"eventContext\"/>\n");
        sb.append("    <property name=\"dataCollector\" ref=\"dataCollector\"/>\n");
        if (up1 != null) sb.append("    <property name=\"upstream1\" ref=\"").append(up1).append("\"/>\n");
        if (up2 != null) sb.append("    <property name=\"upstream2\" ref=\"").append(up2).append("\"/>\n");
        sb.append("  </bean>\n");
        return sb.toString();
    }
}
