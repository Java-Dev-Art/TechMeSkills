package com.tms.HomeWorkFirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Bass implements Instrument {
    private int NumberOfStrings;
    private Type type;

    @Override
    public void play() {
        System.out.printf("Играет гитара  %s количество струн\n", getNumberOfStrings());
    }

    @Override
    public Bass create(Type type) {
        if (type.getName().equalsIgnoreCase(this.type.getName())) {
            return new Bass(4, type);
        }
        return null;
    }
}

