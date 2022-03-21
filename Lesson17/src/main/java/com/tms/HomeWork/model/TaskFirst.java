package com.tms.HomeWork.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskFirst {
    private final List<Integer> myList = new ArrayList<>();
    private Random random = new Random();

    public void setMyList() {
//        myList.stream().map(integer -> myList.add(random.nextInt(50)));
        for (int i = 0; i < 10; i++) {
            myList.add(random.nextInt(50));
        }
        printMyList();
        System.out.println("------------------");
        taskFirst();
    }

    private void taskFirst() {
        myList.stream().map(integer -> integer * 2).forEach(System.out::println);
    }

    private void printMyList() {
        myList.stream().forEach(System.out::println);
    }
}
