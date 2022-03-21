package com.tms.HomeWork.service;

import com.tms.HomeWork.model.TaskFirst;
import com.tms.HomeWork.model.TaskSecond;

public class Main {
    public static void main(String[] args) {
        TaskFirst first = new TaskFirst();
        first.setMyList();

        TaskSecond second = new TaskSecond();
        second.taskSet();
    }
}
