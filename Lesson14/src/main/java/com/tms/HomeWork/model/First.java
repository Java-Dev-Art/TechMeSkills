package com.tms.HomeWork.model;

import java.io.*;

public class First {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson14/src/main/resources/input.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(SOURCE));
             BufferedWriter writer = new BufferedWriter(new FileWriter
                     ("/home/artur/TechmeSkills/TechMeSkills/Lesson14/src/main/resources/output.txt"))) {
            String lineText;
            while ((lineText = reader.readLine()) != null) {
                if (lineReserved(lineText)) {
                    writer.write(lineText + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean lineReserved(String line) {
        StringBuilder buffer = new StringBuilder(line);
        buffer.reverse();
        if (line.equalsIgnoreCase(buffer.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
