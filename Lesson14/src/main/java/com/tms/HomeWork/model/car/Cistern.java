package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Builder
@Getter
public class Cistern implements Serializable {
    @JsonProperty("Тип топлива")
    private String typeFuel;
    @JsonProperty("Обьем")
    private double volume;
}
