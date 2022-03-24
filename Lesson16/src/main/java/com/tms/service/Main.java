package com.tms.service;

import com.tms.model.Goods;
import com.tms.model.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Goods> goods = new ArrayList<>(Arrays.asList(
                new Goods(12, "Window", 125),
                new Goods(78, "Door", 896),
                new Goods(13, "Floor", 256),
                new Goods(8, "Table", 103),
                new Goods(32, "Televise", 256),
                new Goods(18, "Armchair", 26)
        ));
        List<Integer> integers = new ArrayList<>();
        Shop shop = new Shop(goods, integers);
        shop.setCheckList();//set id
        shop.getAllGoods();
        shop.deleteG(12);
        shop.getAllGoods();
        shop.printCheck();
        shop.setGoodsList(new Goods(14, "P", 55));
        shop.setGoodsList(new Goods(18, "P", 55));
        shop.printCheck();
        shop.getAllGoods();
        shop.edit(new Goods(13, "PO", 55));//?
        shop.printSort();
    }
}
