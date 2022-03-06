package com.tms.HomeWork.model.car;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Builder
@Getter
public class Cistern implements Serializable {
    private String typeFuel;
    private double volume;
}
