package com.tms.HomeWork.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskSecond {
    private final Set<Integer> mySet = new HashSet<>();
    private Random random = new Random();

    private void setMySet() {
        System.out.println("Идет заполнение Set");
        for (int i = 0; i <= 50; i++) {
            mySet.add(random.nextInt(100));
            System.out.println(i);
        }
        System.out.println("Set заполненный\n----------");
    }

    public void taskSet() {
        setMySet();
        System.out.println("Количество четных элементов : " + mySet.stream().filter(integer -> integer % 2 == 0).count());
    }
}
