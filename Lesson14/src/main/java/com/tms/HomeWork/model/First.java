package com.tms.HomeWork.model;

import com.tms.HomeWork.model.car.Car;
import com.tms.HomeWork.model.car.Cistern;
import com.tms.HomeWork.model.car.Motor;

import java.io.*;

public class First {
    private final static String SOURCE = "/home/artur/TechmeSkills/TechMeSkills/Lesson14/src/main/resources/";
    private final static String INPUT = SOURCE + "input.txt";
    private final static String OUTPUT = SOURCE + "output.txt";
    private final static String LENGTH = OUTPUT + "lengthBetween3and5.txt";
    private final static String TEXT = SOURCE + "text.txt";
    private final static String BLACK = SOURCE + "isBlackList.txt";
    private final static String SERIAL = SOURCE + "car.dat";

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
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT));
             BufferedWriter writer = new BufferedWriter(new FileWriter(BLACK))) {
            while ((lineText = reader.readLine()) != null) {
                if (formatter.isBlackList(lineText)) {
                    writer.write(formatter.replace(lineText) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL))) {
            Cistern cistern = Cistern.builder().typeFuel("gaz").volume(125.5).build();
            Motor motor = Motor.builder().numberOfSoils(4).type("Gaz").build();
            Car car = Car.builder().mark("Volvo").cistern(cistern).motor(motor).price(4522356.52).speed(245).build();
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL))) {
            System.out.println(ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
