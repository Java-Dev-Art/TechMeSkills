package com.tms.model;

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

    public void pollidrome(String text) {
        String st = text.replaceAll(",", " ");
        String[] massStr = st.split(" ");
        for (String str : massStr) {
            if (str.equalsIgnoreCase(String.valueOf(new StringBuilder(str).reverse()))) {
                System.out.println(str);
            }
        }
    }
}
