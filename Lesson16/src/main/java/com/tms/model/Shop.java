package com.tms.model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class Shop {

    private List<Goods> goodsList = new ArrayList<>();
    private List<Integer> checkList = new ArrayList<>();

    public void setCheckList() {
        saveId();
        printCheck();
    }

    public void setGoodsList(Goods goods) {
        if (checkId(goods)) {
            System.out.println("Sorry we have this goods in our shop");
        }
        goodsList.add(goodsList.size(), goods);
        saveId();
        System.out.println("WE ADD THIS PRODUCT");
    }

    public void getAllGoods() {
        goodsList.forEach(System.out::println);
    }

    public void deleteG(int id) {
        if (checkList.contains(id)) {
            goodsList.removeIf(goods -> goods.getId() == id);
            delCheck(id);
            System.out.printf("we remove goods with id %d \n", id);
        } else {
            System.out.printf("We don't have goods with this id %d\n", id);
        }
    }

    public void edit(Goods goods) {
        if (checkId(goods)) {
            goodsList.set(index(goods.getId()), goods);
        } else {
            System.out.println("Sorry we can't edit list");
        }
    }

    private void saveId() {
        for (Goods goods : goodsList) {
            checkList.add(goods.getId());
        }
    }

    private boolean checkId(Goods goods) {
        return checkList.contains(goods.getId());
    }

    private Integer index(int id) {
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getId() == id) {
                return i;
            }
        }
        return 0;
    }

    private boolean delCheck(int i) {
        for (int j = 0; j < checkList.size(); j++) {
            if (checkList.contains(i)) {
                checkList.remove(j);
                return true;
            }
        }
        return false;
    }

    public void printCheck() {
        checkList.forEach(System.out::println);
    }

    public void printSort() {
        Collections.sort(goodsList);
        goodsList.forEach(System.out::println);
    }
}