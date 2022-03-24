package com.tms.HomeWork.service;


import com.tms.HomeWork.model.t4.Car;
import com.tms.HomeWork.model.t5.Person;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

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
        cars.stream().
                filter(car -> StringUtils.isAllBlank(car.getNumber()) && car.getYear() >= 2012).
                forEach(System.out::println);

//        CarInfo carInfo = new CarInfo();
//        carInfo.printCarsNumber(cars, (Car c) ->
//                c.getYear() >= 2012 && !Objects.equals(c.getNumber(), "") && !Objects.equals(c.getNumber(), null));
//        System.out.println("------------------");

        System.out.println("Task 5");
        List<Person> people = Arrays.asList(
                new Person("Artur", "Markowski", 'm', 30),
                new Person("Mariya", "Napoli", 'f', 20),
                new Person("Kseniya", "Kasko", 'f', 21),
                new Person("Oleg", "Bernad", 'm', 50),
                new Person("Tomasz", "Kazakiewicz", 'm', 40),
                new Person("Miletina", "Staniuta", 'f', 30)
        );

    }
}
