package com.tms.service;

import com.tms.model.Auto;
import com.tms.model.MilitaryOffice;
import com.tms.model.Person;
import com.tms.model.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().name("Max").sex("mel").lastName("Ivanov").age(25).build();
        Person person1 = Person.builder().name("Kar").sex("mel").lastName("Pov").age(25).build();
        Person person2 = Person.builder().name("Inga").sex("fam").lastName("Ivanova").age(25).build();
        Person person3 = Person.builder().name("Maximilian").sex("mel").lastName("Ivanov").age(25).build();
        Person person4 = Person.builder().name("Marcus").sex("mel").lastName("Ivanov").age(25).build();

        PersonRegistry registry = new PersonRegistry(person);
        PersonRegistry registry1 = new PersonRegistry(person1);
        PersonRegistry registry2 = new PersonRegistry(person2);
        PersonRegistry registry3 = new PersonRegistry(person3);
        PersonRegistry registry4 = new PersonRegistry(person4);

        MilitaryOffice militaryOffice = new MilitaryOffice(registry);
        MilitaryOffice militaryOffice1 = new MilitaryOffice(registry1);
        MilitaryOffice militaryOffice2 = new MilitaryOffice(registry2);
        MilitaryOffice militaryOffice3 = new MilitaryOffice(registry3);
        MilitaryOffice militaryOffice4 = new MilitaryOffice(registry4);

        militaryOffice.recruit();
        militaryOffice1.recruit();
        militaryOffice2.recruit();
        militaryOffice3.recruit();
        militaryOffice4.recruit();

        Auto.Engin engin = new Auto.Engin();
        Auto.GasTank gasTank = new Auto.GasTank();
        engin.setOn(true);
        gasTank.setRefuel(true);

        Auto auto = new Auto(engin, gasTank);

        auto.onEngin();
        auto.ofEngin();
        auto.onEngin();
    }
}
