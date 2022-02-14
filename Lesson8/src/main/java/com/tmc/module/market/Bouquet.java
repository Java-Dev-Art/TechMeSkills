package com.tmc.module.market;

import java.util.List;

public class Bouquet {
    public List<Flower> flowers;

    public Bouquet(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void priceBouquet() {
        int count = 0;
        int price = 0;
        for (Flower flower : flowers) {
            count++;
            price += flower.getPrice();
        }
        System.out.printf("Количество цветов в букете %d\nСтоимость букета %d", count, price);
    }
}
