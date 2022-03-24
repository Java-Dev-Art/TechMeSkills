package com.tms.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Goods> goodsList = new ArrayList<>();
    private final List<Integer> checkList = new ArrayList<>();

    public void setGoodsList(Goods goods) {
        saveId();
        if (checkId(goods)) {
            System.out.println("Sorry we have this goods in our shop");
        }
        goodsList.add(goods);
    }

    public void getAllGoods() {
        goodsList.forEach(System.out::println);
    }

    public void deleteG(int id) {
        if (checkList.contains(id)) {
            for (int i = 0; i < goodsList.size(); i++) {
                if (goodsList.get(i).getId() == id) {
                    goodsList.remove(id);
                }
            }
            checkList.remove(id);
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
}
