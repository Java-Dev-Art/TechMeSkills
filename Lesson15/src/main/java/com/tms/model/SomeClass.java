package com.tms.model;

import java.io.Serializable;

public class SomeClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    T t;
    V v;
    K k;

    public SomeClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void getNameClass() {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }
}
