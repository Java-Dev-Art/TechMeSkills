package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class Cistern implements Serializable {
    @JsonProperty("Type Fuel")
    private String typeFuel;
    @JsonProperty("Volume")
    private double volume;
}
