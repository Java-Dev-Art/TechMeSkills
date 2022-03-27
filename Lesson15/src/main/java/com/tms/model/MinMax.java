package com.tms.model;

public class MinMax<A extends Comparable> {
    A[] a;

    public MinMax(A[] a) {
        this.a = a;
    }

    public void getMin() {
        A min = a[0];
        A max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        System.out.printf("MIN = %d\nMAX = %d", min, max);
    }
}
