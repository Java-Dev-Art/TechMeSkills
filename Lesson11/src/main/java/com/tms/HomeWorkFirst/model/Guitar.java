package com.tms.HomeWorkFirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private int NumberOfStrings;
    private Type type;

    @Override
    public void play() {
        System.out.printf("Играет гитара  %s количество струн\n", getNumberOfStrings());
    }

    @Override
    public Guitar create(Type type) {
        if (type.getName().equalsIgnoreCase(this.type.getName())) {
            System.out.println("Create GUITAR");
            return new Guitar(6, type);
        }
        System.out.println("This is not our ENUM");
        return null;
    }
}
