package com.tms.robot.service;

import com.tms.robot.module.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(1123654);
        System.out.println(robot);
        robot.onContinental();
        robot.go();
        robot.headOn();
        System.out.println(robot);
        robot.listenOn();
        robot.seeOn();
        System.out.println(robot);
        robot.offContinental();
        robot.takeOn();
        robot.headOn();
        System.out.println(robot);

    }
}
