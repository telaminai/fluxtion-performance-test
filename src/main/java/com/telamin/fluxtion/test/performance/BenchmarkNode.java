package com.telamin.fluxtion.test.performance;

import com.telamin.fluxtion.runtime.annotations.OnTrigger;

public class BenchmarkNode implements Node {
    private Node upstream1;
    private Node upstream2;
    private int value;

    @OnTrigger
    public boolean handleUpdate() {
        int v1 = upstream1 == null ? 0 : upstream1.getValue();
        int v2 = upstream2 == null ? 0 : upstream2.getValue();
        value = v1 + v2 + 1;
        return true;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setUpstream1(Node upstream1) {
        this.upstream1 = upstream1;
    }

    public void setUpstream2(Node upstream2) {
        this.upstream2 = upstream2;
    }
}
