package com.tms.HomeWork.model.car;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
@Getter
public class Motor implements Serializable {
    private String type;
    private transient int numberOfSoils;
}
