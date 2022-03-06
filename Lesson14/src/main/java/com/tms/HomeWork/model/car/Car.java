package com.tms.HomeWork.model.car;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
@Getter
public class Car implements Serializable {
    private String mark;
    private Motor motor;
    private Cistern cistern;
    private int speed;
    private double price;
}
