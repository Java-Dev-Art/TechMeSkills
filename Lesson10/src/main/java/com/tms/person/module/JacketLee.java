package com.tms.person.module;

import com.tms.person.constants.Marks;

public class JacketLee implements Jacket {
    @Override
    public void takeOn() {
        System.out.printf("Одел %s\n", Marks.LEE.getName());
    }

    @Override
    public void takeOff() {
        System.out.printf("Снял %s\n", Marks.LEE.getName());
    }
}
