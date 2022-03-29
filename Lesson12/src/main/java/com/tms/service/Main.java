package com.tms.service;

import com.tms.model.Authorization;
import com.tms.model.Car;
import com.tms.model.WrongLoginException;
import com.tms.model.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 4563.23, 555);
        Car car1 = new Car("Mercedes", 123.22, 555);
        Car car2 = new Car("Volvo", 4763.23, 555);
        Car car3 = new Car("BMV", 6363.23, 555);
        Car car4 = new Car("Porshe", 78963.23, 555);

//        try {
//            car.start();
//            car1.start();
//            car2.start();
//            car3.start();
//            car4.start();
//        } catch (CarException e) {
//            e.printStackTrace();
//        }
        try {
            Authorization.checkAuthorization("ArtyuertFtsdfgrtjklk", "123456789wertyuiopl", "123456789qwertyuiopl");
        } catch (WrongPasswordException | WrongLoginException e) {
            e.printStackTrace();
        }

    }
}
