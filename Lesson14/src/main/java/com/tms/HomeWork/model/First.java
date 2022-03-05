package com.tms.HomeWork.model;

import java.io.*;

public class First {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson14/src/main/resources/";
    private final static String INPUT = SOURCE + "input.txt";
    private final static String OUTPUT = SOURCE + "output.txt";
    private final static String LENGTH = OUTPUT + "lengthBetween3and5.txt";
    private final static String TEXT = SOURCE + "text.txt";

    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter();
        String lineText;
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT))) {
            while ((lineText = reader.readLine()) != null) {
                if (formatter.isPolidrome(lineText)) {
                    writer.write(lineText + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT));
             BufferedWriter writer = new BufferedWriter(new FileWriter(LENGTH))) {
            while ((lineText = reader.readLine()) != null) {
                if (formatter.isLengthNorm(lineText)) {
                    writer.write(lineText + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
