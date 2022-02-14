package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
@Getter
public class Cargo extends GroundTransports {
    private double loadCapacity;
    public double mass;

    public void load(double mass) {
        this.mass = mass;
        if (mass > loadCapacity) {
            System.out.println("Загрузка не возможна!!!\nПревышение грузоподбемности");
        } else {
            System.out.printf("Загрузка произведена успешно!!!\nОсталось свободного места %.2f", loadBalance());
        }
    }

    private double loadBalance() {
        return loadCapacity - mass;
    }
}
