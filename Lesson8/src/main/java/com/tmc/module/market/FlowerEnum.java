package com.tmc.module.market;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum FlowerEnum {
    ROSE(10, "rose"),
    LILY(89, "lily"),
    ASTER(25, "aster"),
    HERBERA(98, "herbera"),
    TULIP(46, "tulip"),
    CARNATION(44, "carnation");

    final int price;
    final String name;
}
