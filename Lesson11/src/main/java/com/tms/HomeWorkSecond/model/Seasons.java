package com.tms.HomeWorkSecond.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum Seasons {
    WINTER("Winter", -10.5), SPRING("Spring", 17.8), SUMMER("Summer", 20.5), AUTUMN("Autumn", 10.4);
    private final String name;
    private final double aveTemp;
}
