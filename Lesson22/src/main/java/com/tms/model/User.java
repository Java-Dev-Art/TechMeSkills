package com.tms.model;

public class User {
    private String pass;
    private String name;

    {
        pass = "1234";
        name = "ArTuR";
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
                "pass=" + pass +
                ", name='" + name + '\'' +
                '}';
    }
}
