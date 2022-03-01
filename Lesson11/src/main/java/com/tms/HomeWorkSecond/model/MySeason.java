package com.tms.HomeWorkSecond.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MySeason {
    public double aveTemp;
    private Seasons seasons;

    public MySeason(Seasons seasons) {
        this.seasons = seasons;
    }

    public void setAveTemp(double aveTemp) {
        this.aveTemp = aveTemp;
    }

    public void seasonsLike(Seasons seasons) {
        switch (seasons) {
            case SPRING:
                getDescription();
                System.out.println("I don't like spring:(\nBecause Average temperature = " + getAveTemp());
                break;
            case SUMMER:
                getDescription();
                System.out.println("I very like SUUUUMER it's my favorite season\nBecause Average temperature = " + getAveTemp());
                break;
            case AUTUMN:
                getDescription();
                System.out.println("I don't like Autumn:(\nBecause Average temperature = " + getAveTemp());
                break;
            case WINTER:
                getDescription();
                System.out.println("I don't like Winter:(\nBecause Average temperature = " + getAveTemp());
                break;
            default:
                System.out.println("Please Choose Seasons!!!!");
        }
    }

    public void getDescription() {
        if (getAveTemp() < -1) {
            setAveTemp(Seasons.WINTER.getAveTemp());
            System.out.println("It's to coldly(((");
        } else if (getAveTemp() > -1 && getAveTemp() < 10) {
            setAveTemp(Seasons.AUTUMN.getAveTemp());
            System.out.println("Normal weather not bad:/");
        } else if (getAveTemp() >= 10 && getAveTemp() <= 20) {
            setAveTemp(Seasons.SPRING.getAveTemp());
            System.out.println("Very Good!");
        } else if (getAveTemp() > 20) {
            setAveTemp(Seasons.SUMMER.getAveTemp());
            System.out.println("I like summer COOL");
        }
    }
}
