package com.tms.HomeWork.model;

import com.fasterxml.jackson.databind.ObjectMapper;
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
    private final static String JSON = SOURCE + "car.json";

    public static void main(String[] args) throws IOException {
        TextFormatter formatter = new TextFormatter();
        String lineText;
        Cistern cistern = new Cistern();
        cistern.setTypeFuel("GAZ");
        cistern.setVolume(556.3);
        Motor motor = new Motor();
        motor.setType("MY");
        motor.setNumberOfSoils(5);
        Car car = new Car();
        car.setCistern(cistern);
        car.setMotor(motor);
        car.setPrice(4568.3);
        car.setSpeed(4656);
        car.setMark("Volvo");

        ObjectMapper om = new ObjectMapper();

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
        //Searialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL))) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Deserializ
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL))) {
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Object convert to JSON
        try {
            om.writeValue(new File(JSON), car);
//            om.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,false);
//            Car car1 = om.readValue(JSON,Car.class);
//            System.out.println(car1.getMark());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //JSON to Object
        jsonToObject();
    }

    public static void jsonToObject() throws IOException {
        System.out.println("JSON to Object");
        ObjectMapper om = new ObjectMapper();
        Car car1 = om.readValue(new File(JSON), Car.class);
        System.out.println(car1.getMark());
        System.out.println(car1.getPrice());
    }
}
