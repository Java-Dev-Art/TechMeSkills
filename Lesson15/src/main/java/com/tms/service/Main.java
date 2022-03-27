package com.tms.service;

import com.tms.model.Calculator;

public class Main {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson15/src/";

    public static void main(String[] args) {
//        ReadMyFile readMyFile = new ReadMyFile();
//        readMyFile.read(new File(SOURCE));
//        Animal fox =new Animal("FOX");
//        SomeClass someClass = new SomeClass(45,fox,4);
//        someClass.getNameClass();
//        Integer[] my = {1, 4, 6, 70, 0};
//        MinMax minMax = new MinMax(my);
//        minMax.getMin();

//        System.out.println(Calculator.sum(1,2));
//        System.out.println(Calculator.sum(10.5,25.6));
//        System.out.println(Calculator.sum(1,2.6));
//        System.out.println(Calculator.sum(1.9,2));
//        String s = "8";
//        System.out.println(Calculator.sum("9",s));
//        System.out.println(Calculator.sum(null,2));
//        System.out.println(Calculator.sum(1,null));

//        System.out.println(Calculator.multiply(1,2));
//        System.out.println(Calculator.multiply(10.5,25.6));
//        System.out.println(Calculator.multiply(1,2.6));
//        System.out.println(Calculator.multiply(1.9,2));
////        String s = "8";
////        System.out.println(Calculator.multiply("9",s));
//        System.out.println(Calculator.multiply(null,2));
//        System.out.println(Calculator.multiply(1,null));

//        System.out.println(Calculator.divide(1,2));
//        System.out.println(Calculator.divide(10.5,25.6));
//        System.out.println(Calculator.divide(1,2.6));
//        System.out.println(Calculator.divide(1.9,2));
////        String s = "8";
////        System.out.println(Calculator.divide("9",s));
//        System.out.println(Calculator.divide(null,2));
//        System.out.println(Calculator.divide(1,null));

        System.out.println(Calculator.subtraction(1, 2));
        System.out.println(Calculator.subtraction(10.5, 25.6));
        System.out.println(Calculator.subtraction(1, 2.6));
        System.out.println(Calculator.subtraction(1.9, 2));
//        String s = "8";
//        System.out.println(Calculator.divide("9",s));
        System.out.println(Calculator.subtraction(null, 2));
        System.out.println(Calculator.subtraction(1, null));


    }
}
