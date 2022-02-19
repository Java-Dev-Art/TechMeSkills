package com.tms.HomeWorkFirst.model;

public interface Instrument {
    String KEY = "До мажор";

    void play();

    Instrument create(Type type);
}
