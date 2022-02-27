package com.tms.shuttle.module;

import java.util.Random;

public class Shuttle implements IStart {
    private final Random random = new Random();

    @Override
    public boolean check() {

        if (random.nextInt(11) > 3) {
            System.out.println("проверка прошла успешно!!!!");
            return true;
        } else {
            System.out.println("проверка провалена....");
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла\n" +
                "запущены");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла!!!");
    }
}
