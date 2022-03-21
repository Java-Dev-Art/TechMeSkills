package com.tms.HomeWork.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskName {
    private final List<String> names = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void setNames() {
        someTxt();
        String s = scanner.nextLine();
        do {
            while (names.size() < 10) {
                setList(s);
            }
        } while (s.equalsIgnoreCase("MORIS"));
        System.out.println("List add finish");
    }

    private void setList(String s) {
        names.add(s);
    }

    private void someTxt() {
        System.out.println("Please enter name :");
    }
}
