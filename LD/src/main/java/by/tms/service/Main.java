package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 123, 55689);
        System.out.println(computer.toString());
        computer.on();
    }
}
