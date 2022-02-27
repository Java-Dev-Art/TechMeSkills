package com.tms.person.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Marks {
    BOSS(456, "BOSS"),
    LACOSTE(477, "Lacoste"),
    LEE(556, "Lee");
    final int price;
    final String name;
}
