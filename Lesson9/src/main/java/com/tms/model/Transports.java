package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Transports {
    public double power;
    private double maxSpeed;
    private double mass;
    private Marks mark;

    public Transports() {
    }
}
