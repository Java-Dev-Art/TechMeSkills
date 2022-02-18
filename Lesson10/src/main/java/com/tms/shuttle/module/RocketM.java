package com.tms.shuttle.module;

import java.util.Random;

public class RocketM implements IStart {
    private final Random random = new Random();

    @Override
    public boolean check() {

        if (random.nextInt(2) == 1) {
            System.out.println("проверка прошла успешно!!!!");
            return true;
        } else {
            System.out.println("проверка провалена....");
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели RocketM\n" +
                "запущены");

    }

    @Override
    public void start() {
        System.out.println("Старт RocketM!!!");
    }
}
