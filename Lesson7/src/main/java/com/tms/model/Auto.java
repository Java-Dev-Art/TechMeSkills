package com.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Auto {
    public Engin engin;
    public GasTank gasTank;

    public Auto(Engin engin, GasTank gasTank) {
        this.engin = engin;
        this.gasTank = gasTank;
    }

    public void onEngin() {
        if (getGasTank().refuel & getEngin().on) {
            System.out.println("Впуть!!!");
        } else {
            System.out.println("Заправте авто");
        }
    }

    public void ofEngin() {
        System.out.println("Машина заглушена");
        Auto.Engin e = new Auto.Engin();
        e.setOn(false);
    }

    public static class Engin {
        public boolean on;

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }
    }

    public static class GasTank {
        public boolean refuel;

        public boolean isRefuel() {
            return refuel;
        }

        public void setRefuel(boolean refuel) {
            this.refuel = refuel;
        }
    }
}
