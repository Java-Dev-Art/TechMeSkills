package com.tms.HomeWorkSecond.service;

import com.tms.HomeWorkSecond.model.MySeason;
import com.tms.HomeWorkSecond.model.Seasons;

public class Main {
    public static void main(String[] args) {
        MySeason season = new MySeason(Seasons.SUMMER);
        season.seasonsLike(Seasons.SPRING);
    }
}
