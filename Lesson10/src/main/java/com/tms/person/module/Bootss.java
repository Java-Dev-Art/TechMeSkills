package com.tms.person.module;

import com.tms.person.constants.Marks;

public interface Bootss {
    static void takeOn() {
        System.out.printf("Обулся в %s\n", Marks.LACOSTE.getName());
    }

    static void takeOff() {
        System.out.printf("Снял %s\n", Marks.LACOSTE.getName());
    }
}
