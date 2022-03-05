package com.tms.HomeWork.model;

public class TextFormatter {
    public boolean isPolidrome(String line) {
        StringBuilder buffer = new StringBuilder(line);
        buffer.reverse();
        if (line.equalsIgnoreCase(buffer.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLengthNorm(String line) {
        String[] words = line.split("\\s");
        if (words.length >= 3 && words.length <= 5) {
            return true;
        } else {
            return false;
        }
    }
}
