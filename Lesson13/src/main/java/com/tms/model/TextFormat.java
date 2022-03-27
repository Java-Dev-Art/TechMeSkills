package com.tms.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormat {
    public String cutSomeChar(String text, char a, char b) {
        int start = text.indexOf(a);
        int end = text.lastIndexOf(b);
        return text.substring(start, end);
    }

    public String replaceSymbol(String text) {
        char first = text.charAt(2);
        char second = text.charAt(0);
        return text.replace(first, second);
    }

    public boolean pollidrome(String text) {
        String st = text.replaceAll(",", "");
        String[] massStr = st.split(" ");
        for (String str : massStr) {
            if (str.equalsIgnoreCase(String.valueOf(new StringBuilder(str).reverse()))) {
//                System.out.println(str);
                return true;
            }
        }
        return false;
    }

    public void checkText(String text) {
        String[] mass = text.split("[.,]");
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]{3,5}");

        for (String str : mass) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                System.out.println(str);
            }
            if (pollidrome(str)) {
                System.out.println(str);
            }
        }
    }
}
