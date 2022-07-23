package com.tms.model;

public class User {
    private String pass;
    private String name;
    {
        pass = "0000";
        name = "art";
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "pass='" + getPass()+ '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
