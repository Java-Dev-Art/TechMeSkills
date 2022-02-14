package com.tms.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonRegistry {
    private Person person;

    public PersonRegistry(Person person) {
        this.person = person;
    }
}
