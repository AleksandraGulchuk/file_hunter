package com.hillel;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FileHunter fileHunter = new FileHunter();
        File f = fileHunter.findAbsoluteFile(new File("."), "1.txt");
        try {
            System.out.println(f.getAbsolutePath());
        } catch (NullPointerException e) {
            System.out.println("file not found");
        }

    }

}


