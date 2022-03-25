package com.tms.service;

import com.tms.model.MinMax;

public class Main {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson15/src/";

    public static void main(String[] args) {
//        ReadMyFile readMyFile = new ReadMyFile();
//        readMyFile.read(new File(SOURCE));
//        Animal fox =new Animal("FOX");
//        SomeClass someClass = new SomeClass(45,fox,4);
//        someClass.getNameClass();
        Integer[] my = {1, 4, 6, 70, 0};
        MinMax minMax = new MinMax(my);
        minMax.getMin();
    }
}
