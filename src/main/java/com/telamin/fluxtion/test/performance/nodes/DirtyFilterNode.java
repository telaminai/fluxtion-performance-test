package com.telamin.fluxtion.test.performance.nodes;

public class DirtyFilterNode {
    public double value;
    public DirtyFilterNode upstream1;

    public void setUpstream1(DirtyFilterNode upstream1) { this.upstream1 = upstream1; }
    public double getValue() { return value; }
}
