package com.tms.robot.module.constats;

public enum Prices {

    PHILIPS(456, "Philips"),
    SAMSUNG(1203, "Samsung"),
    JBL(452, "JBL"),
    INTEL(500, "Intel"),
    SONY(852, "SONY"),
    CONTINENTAL(459, "Continental");
    final int price;
    final String name;

    Prices(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
