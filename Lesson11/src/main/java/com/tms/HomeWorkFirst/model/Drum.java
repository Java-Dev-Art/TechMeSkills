package com.tms.HomeWorkFirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements Instrument {
    private int Dimensions;
    private Type type;

    @Override
    public void play() {
        System.out.printf("Играют ударные %s размер\n", getDimensions());
    }

    @Override
    public Drum create(Type type) {
        if (type.getName().equalsIgnoreCase(this.type.getName())) {
            return new Drum(78, type);
        }
        return null;
    }
}