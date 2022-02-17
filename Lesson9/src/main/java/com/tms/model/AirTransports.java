package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class AirTransports extends Transports {
    private double wingspan;
    private int minTakeOfLength;

    public AirTransports() {
    }
}
