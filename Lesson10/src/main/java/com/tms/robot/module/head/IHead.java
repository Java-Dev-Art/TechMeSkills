package com.tms.robot.module.head;

public interface IHead extends Intel, JBL, PHILIPS, SAMSUNG {
    int PRICE_HEAD = PRICE_INTEL + PRICE_JBL + PRICE_PHILIPS + PRICE_SAMSUNG;

    void headOn();

    void headOff();
}
