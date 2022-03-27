package com.tms.service;

import com.tms.model.Accouteble;
import com.tms.model.Employee;
import com.tms.model.TextFormat;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String source = "Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B) " +
                "txt, local, mart подстроку из строки " +
                "начиная с mam pppp заказ, казак, дед. Artur come to me";

        TextFormat textFormat = new TextFormat();
        System.out.println(textFormat.cutSomeChar(source, ' ', 'а'));
        System.out.println();
        System.out.println(textFormat.replaceSymbol("text"));
        textFormat.pollidrome(source);
        System.out.println("--------");
        textFormat.checkText(source);
        System.out.println(textFormat.returnLength(source));

        List<Employee> employees = Arrays.asList(
                new Employee("Markowski.AM", 3256.25),
                new Employee("Radczenko.B.V", 88886.36),
                new Employee("Dorosz.A.A.", 778989.32),
                new Employee("Martynenko.W.P.", 6545449.236),
                new Employee("Nurst A.A.", 48884.20),
                new Employee("Bogun W.W.", 45623.3)
        );
        Accouteble accouteble = new Accouteble();
        accouteble.generateReport(employees);

    }
}
