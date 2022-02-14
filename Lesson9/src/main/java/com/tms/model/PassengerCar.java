package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class PassengerCar extends GroundTransports {
    private int numberOfPassenger;
    private String type;
    public double kV;
    public double dis;

    public double powerKv() {
        return this.kV = super.getPower() * 0.74;
    }

    public void distance(double time) {
        dis = super.getMaxSpeed() * time;
        System.out.printf("За время (%.1f) ч, автомобиль (%s)\n" +
                "двигаясь с максимальной скоростью (%f) км/ч\n" +
                "проедет (%.2f) км и израсходует (%.1f) литров топлива.", time, super.getMark(), super.getMaxSpeed(), dis, km());
    }

    private double km() {
        return dis / super.getFuelConsumption();
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", type='" + type + '\'' +
                ", kV=" + kV +
                '}';
    }
}
