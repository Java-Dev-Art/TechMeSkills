package com.tms.service;

import com.tms.model.*;

public class Main {
    public static void main(String[] args) {
//        PassengerCar car = new PassengerCar(2,"KAbrio",0.0);
        PassengerCar car = PassengerCar.builder().numberOfPassenger(4).type("Combo").build();
        System.out.println(car);
        car.setPower(546.2);
        car.powerKv();
        System.out.println(car);
        car.setFuelConsumption(4.3);
        car.setMaxSpeed(178);
        car.setMark(Marks.BMW);
        car.distance(4.2);

        Cargo cargo = Cargo.builder().loadCapacity(50.5).build();
        System.out.println(cargo);
        cargo.load(45.2);

        PassengerAirTransport ps = PassengerAirTransport.builder().numbersOfPassengers(72).build();
        ps.load(70);
        System.out.println(ps);

        MilitaryTransports ml = MilitaryTransports.builder().ejection(true).numberOfRocket(12).build();
        System.out.println(ml);
        ml.shut(11);
        ml.ejectionOn();
    }
}
