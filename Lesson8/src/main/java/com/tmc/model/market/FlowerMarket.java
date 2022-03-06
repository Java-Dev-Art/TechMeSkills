package com.tmc.model.market;

import java.util.ArrayList;
import java.util.List;

public class FlowerMarket {
    //Не совсем понимаю, как тут обыграть
    public Bouquet getBouquet(String... flowers) {
        List<Flower> flowerList = new ArrayList<>();
        for (String flower : flowers) {
//            flowerList.add(new Flower().setName(flower));
        }
        Bouquet bouquet = new Bouquet(flowerList);
        return bouquet;
    }
}
