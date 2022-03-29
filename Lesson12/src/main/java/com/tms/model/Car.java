package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private String mark;
    private double price;
    private int speed;

    public void start() throws CarException {
        Random random = new Random();
        if (random.nextInt(20) % 2 != 0) {
            System.out.printf("Car %s on motor\n", getMark());
        } else {
            throw new CarException(getMark());
        }
    }
}
