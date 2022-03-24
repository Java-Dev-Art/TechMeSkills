package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Goods implements Comparable<Goods> {
    private int id;
    private String name;
    private int price;

    @Override
    public int compareTo(Goods o) {
        return this.getId() - o.getId();
    }
}
