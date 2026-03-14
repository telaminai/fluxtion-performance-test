package com.telamin.fluxtion.test.performance.service;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Intermediate node for the short-chain service benchmark.
 * Both upstream references are typed as {@link ShortChainNodeBase} so the
 * same class can wire to either the root or another intermediate node,
 * enabling arbitrary-depth linear and diamond chains.
 * Adds upstream values + 1.0 and always propagates.
 */
public class ShortChainNode extends ShortChainNodeBase {
    private String            nodeId    = "sc_node";
    private ShortChainNodeBase upstream1;
    private ShortChainNodeBase upstream2;
    private double value;

    @OnTrigger
    public boolean onUpstream() {
        double v1 = upstream1 != null ? upstream1.getValue() : 0.0;
        double v2 = upstream2 != null ? upstream2.getValue() : 0.0;
        value = v1 + v2 + 1.0;
        return true;
    }

    @Override
    public double getValue()  { return value; }
    public String getNodeId() { return nodeId; }

    public void setNodeId(String nodeId)              { this.nodeId = nodeId; }
    public void setUpstream1(ShortChainNodeBase u)    { this.upstream1 = u; }
    public void setUpstream2(ShortChainNodeBase u)    { this.upstream2 = u; }
    public ShortChainNodeBase getUpstream1()          { return upstream1; }
    public ShortChainNodeBase getUpstream2()          { return upstream2; }
}
