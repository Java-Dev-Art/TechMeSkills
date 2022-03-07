package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
@Getter
public class Motor implements Serializable {
    @JsonProperty("Тип")
    private String type;
    @JsonIgnore
    private transient int numberOfSoils;
}
