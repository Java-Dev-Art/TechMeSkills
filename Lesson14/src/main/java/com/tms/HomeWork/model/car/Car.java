package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("Mark")
    private String mark;
    @JsonProperty("Motor")
    private Motor motor;
    @JsonProperty("Cistern")
    private Cistern cistern;
    @JsonProperty("Speed")
    private int speed;
    @JsonProperty("Price")
    private double price;
}
