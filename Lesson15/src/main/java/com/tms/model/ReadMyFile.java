package com.tms.model;

import java.io.File;

public class ReadMyFile {
    public void read(File nameF) {
        File dir = new File(String.valueOf(nameF));
        if (dir.isDirectory()) {
            for (File f : dir.listFiles()) {
                if (f.isDirectory()) {
                    System.out.println(f.getName() + "\tfolder");
                    read(f);
                } else {
                    System.out.println(f.getName().toUpperCase() + "\tfile");
                }
            }
        }
    }
}
