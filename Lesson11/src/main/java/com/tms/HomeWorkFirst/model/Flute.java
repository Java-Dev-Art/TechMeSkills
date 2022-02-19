package com.tms.HomeWorkFirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flute implements Instrument {
    private int Diameter;
    private Type type;

    @Override
    public void play() {
        System.out.printf("Играют ударные %s размер\n", getDiameter());
    }

    @Override
    public Flute create(Type type) {
        if (type.getName().equalsIgnoreCase(this.type.getName())) {
            return new Flute(4, type);
        }
        return null;
    }
}
