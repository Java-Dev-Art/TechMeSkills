package com.tms.shuttle.service;

import com.tms.shuttle.module.RocketM;
import com.tms.shuttle.module.Shuttle;
import com.tms.shuttle.module.SpaceX;
import com.tms.shuttle.module.Spaceport;

public class Main {
    public static void main(String[] args) {
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        RocketM rocketM = new RocketM();


        Spaceport spaceport = new Spaceport();

        spaceport.start(shuttle);
        spaceport.start(spaceX);
        spaceport.start(rocketM);
    }
}
