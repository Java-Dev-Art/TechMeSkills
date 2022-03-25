package com.tms.service;

import com.tms.model.ReadMyFile;

import java.io.File;

public class Main {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson15/src/";

    public static void main(String[] args) {
        ReadMyFile readMyFile = new ReadMyFile();
        readMyFile.read(new File(SOURCE));
    }
}
