package com.tms.HomeWork.model.t5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person {
    private String name;
    private String surname;
    private char sex;
    private int year;
}
