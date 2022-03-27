package com.tms.HomeWork.model.t4;

import java.util.List;

public class CarInfo {

    public void printCarsNumber(List<Car> cars, ICar ic) {
        for (Car car : cars) {
            if (ic.check(car)) {
                System.out.println(car);
            }
        }
    }
}
