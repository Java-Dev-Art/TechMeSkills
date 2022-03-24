package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Goods {
    private int id;
    private String name;
    private int price;
}
