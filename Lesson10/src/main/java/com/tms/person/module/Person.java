package com.tms.person.module;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Person {
    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Bootss bootss;

    public Person(String name) {
        this.trousers = new MarketBoss();
        this.jacket = new JacketLee();
    }

    public void takeOn() {
        jacket.takeOn();
        trousers.takeOn();
        Bootss.takeOn();
        System.out.println("--------");
    }

    public void takeOff() {
        jacket.takeOff();
        trousers.takeOff();
        Bootss.takeOff();
        System.out.println("--------");
    }
}
