package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Person {
    private String sex;
    private String country;
    private String city;
    private String name;
    private String lastName;
    private int age;
}
