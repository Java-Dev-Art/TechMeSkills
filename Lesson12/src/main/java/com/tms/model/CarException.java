package com.tms.model;

public class CarException extends Exception {
    public CarException(String message) {
        super(message + " Car Exception !!!!");
    }
}
