package com.kgisl.qs1.map;

import java.io.File;

/**
 * ReadFolder
 */
public class ReadFolder {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\kannan.r\\Desktop\\RW");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
        
    }
}