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
                if (lineReserved(lineText) != "") {
                    writer.write(lineReserved(lineText) + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String lineReserved(String line) {
        StringBuffer buffer = new StringBuffer(line);
        buffer.reverse();
        if (line.equalsIgnoreCase(buffer.toString())) {
            return line;
        } else {
            return "";
        }
    }
}
