package com.tms.HomeWork.service;

import com.tms.HomeWork.model.t4.Car;
import com.tms.HomeWork.model.t4.CarInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        TaskFirst first = new TaskFirst();
//        first.setMyList();
//
//        TaskSecond second = new TaskSecond();
//        second.taskSet();
//
//        TaskName name = new TaskName();
//        name.setNames();

        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        System.out.println("Task # 4");

        CarInfo carInfo = new CarInfo();
        carInfo.printCarsNumber(cars, (Car c) ->
                c.getYear() >= 2012 && Objects.equals(c.getNumber(), "") || Objects.isNull(c.getNumber()));
        System.out.println("------------------");

    }
}
