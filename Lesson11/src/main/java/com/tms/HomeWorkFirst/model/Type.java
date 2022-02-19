package com.tms.HomeWorkFirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum Type {
    GUITAR("Гитара"), BASS("Басуха"), DRUMS("Ударные"), FLUTE("Флейта");
    final String name;
}
