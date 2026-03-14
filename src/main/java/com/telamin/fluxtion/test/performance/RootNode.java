package com.telamin.fluxtion.test.performance;

import com.telamin.fluxtion.runtime.annotations.OnEventHandler;

public class RootNode implements Node {
    private int value;

    @OnEventHandler
    public boolean onEvent(int value) {
        this.value = value;
        return true;
    }

    @Override
    public int getValue() {
        return value;
    }
}
