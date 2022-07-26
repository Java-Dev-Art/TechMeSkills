package com.tms.model;

import java.util.Objects;

public class User {
    private String pass;
    private String name;
    {
        pass = "0000";
        name = "art";
    }

    public User(String pass, String name) {
        this.pass = pass;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(pass, user.pass) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pass, name);
    }
}
