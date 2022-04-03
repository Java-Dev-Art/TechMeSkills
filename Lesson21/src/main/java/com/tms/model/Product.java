package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Product {
    private int id;
    private String nameProduct;
    private String description;
    private double price;
    private int number;
    private boolean availability;
}
