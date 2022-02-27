package com.tms.shuttle.module;

public class Spaceport {
    public void start(IStart start) {
        if (!start.check()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.startingEngines();
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            start.start();
        }
    }
}
