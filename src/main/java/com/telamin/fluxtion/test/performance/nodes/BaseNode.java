package com.telamin.fluxtion.test.performance.nodes;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

/**
 * Simple value accumulator. Always propagates (returns true).
 * Sums upstream values; used in deep_path and diamond_mesh graphs.
 */
public class BaseNode implements ProcessingNode {
    private String nodeId = "base";
    private ProcessingNode upstream1;
    private ProcessingNode upstream2;
    private double value;

    @OnTrigger
    public boolean onUpstreamUpdate() {
        double v1 = upstream1 == null ? 0.0 : upstream1.getValue();
        double v2 = upstream2 == null ? 0.0 : upstream2.getValue();
        value = v1 + v2 + 1.0;
        return true;
    }

    @Override
    public double getValue() { return value; }

    @Override
    public String getNodeId() { return nodeId; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }
    public void setUpstream1(ProcessingNode upstream1) { this.upstream1 = upstream1; }
    public void setUpstream2(ProcessingNode upstream2) { this.upstream2 = upstream2; }
    public ProcessingNode getUpstream1() { return upstream1; }
    public ProcessingNode getUpstream2() { return upstream2; }
}
