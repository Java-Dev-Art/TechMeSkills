package com.tms.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MilitaryOffice {
    private PersonRegistry personRegistry;
    private static int count = 0;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void recruit() {
        if (getPersonRegistry().getPerson().getAge() >= 18 & getPersonRegistry().getPerson().getAge() <= 27 &
                getPersonRegistry().getPerson().getSex().equalsIgnoreCase("mel")) {
            count++;
            System.out.println("Name : " + getPersonRegistry().getPerson().getName() + "\n" +
                    "LastName : " + getPersonRegistry().getPerson().getLastName() + "\n" +
                    "Country : " + getPersonRegistry().getPerson().getCountry() + "\n" +
                    "City : " + getPersonRegistry().getPerson().getCity());
        }
        System.out.println("Количество призывников :" + count);
    }
}
