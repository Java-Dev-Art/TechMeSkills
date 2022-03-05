package com.tms.HomeWork.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {
    private static final String REG = "\\s[а-я]{4}\\s";
    private final Pattern pattern = Pattern.compile(REG);
    private Matcher matcher;

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

    public boolean isBlackList(String line) {
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            return true;
        }
        return false;
    }

    public String replace(String line) {
        return line.replaceAll(REG, "***** ");
    }
}
