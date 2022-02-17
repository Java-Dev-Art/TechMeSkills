package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Setter
public class GroundTransports extends Transports {
    public int numberOfWheels;
    public double fuelConsumption;

    public GroundTransports() {
    }
}
