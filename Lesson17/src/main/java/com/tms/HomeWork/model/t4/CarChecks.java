package com.tms.HomeWork.model.t4;

public class CarChecks implements ICar {
    @Override
    public boolean check(Car car) {
        return car.getYear() > 2012;
    }
}
