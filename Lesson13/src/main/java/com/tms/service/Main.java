package com.tms.service;

import com.tms.model.TextFormat;

public class Main {
    public static void main(String[] args) {
        String source = "Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B) " +
                "txt, local, mart подстроку из строки " +
                "начиная с mam pppp заказ, казак, дед";

        TextFormat textFormat = new TextFormat();
        System.out.println(textFormat.cutSomeChar(source, ' ', 'а'));
        System.out.println();
        System.out.println(textFormat.replaceSymbol("text"));
        textFormat.pollidrome(source);

    }
}
