package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class PassengerAirTransport extends AirTransports {
    private int numbersOfPassengers;
    private boolean businessClass;
    public int myNum;

    public void load(int myNum) {
        this.myNum = myNum;
        if (myNum > numbersOfPassengers) {
            System.out.println("Маленький самолет ,нужен больше");
        } else {
            System.out.printf("Осталось свободного места %d", loadBalance());
        }
    }

    private int loadBalance() {
        return numbersOfPassengers - myNum;
    }
}
