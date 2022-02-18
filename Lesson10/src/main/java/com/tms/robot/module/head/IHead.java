package com.tms.robot.module.head;

import com.tms.robot.module.constats.Prices;


public interface IHead extends Intel, JBL, PHILIPS, SAMSUNG {
    int PRICE_HEAD = Prices.INTEL.getPrice() + Prices.JBL.getPrice() + Prices.PHILIPS.getPrice() + Prices.SAMSUNG.getPrice();

    void headOn();

    void headOff();
}
