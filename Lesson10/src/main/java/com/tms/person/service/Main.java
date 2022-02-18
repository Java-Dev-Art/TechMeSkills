package com.tms.person.service;

import com.tms.person.module.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Artur");
        person.takeOn();
        person.takeOff();
    }
}
