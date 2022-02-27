package com.tms.person.module;

import com.tms.person.constants.Marks;

public class MarketBoss implements Trousers {


    @Override
    public void takeOn() {
        System.out.printf("Надел штаны %s\n", Marks.BOSS.getName());
    }

    @Override
    public void takeOff() {
        System.out.printf("Снял штаны %s\n", Marks.BOSS.getName());
    }
}
