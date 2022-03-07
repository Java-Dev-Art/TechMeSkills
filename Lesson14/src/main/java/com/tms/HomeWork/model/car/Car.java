package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
@Getter
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("Марка")
    private String mark;
    @JsonProperty("Двигатель")
    private Motor motor;
    @JsonProperty("Бак")
    private Cistern cistern;
    @JsonProperty("Скорость")
    private int speed;
    @JsonProperty("Цена")
    private double price;
}
