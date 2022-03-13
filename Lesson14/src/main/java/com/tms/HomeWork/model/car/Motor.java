package com.tms.HomeWork.model.car;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class Motor implements Serializable {
    @JsonProperty("Type")
    private String type;
    @JsonIgnore
    private transient int numberOfSoils;
}
