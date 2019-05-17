package com.kgisl.qs1.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * StreemToString
 */
public class StreemToString {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(new File("C:\\Users\\kannan.r\\Desktop\\RW\\ok.csv"));

        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        StringBuffer op = new StringBuffer();
        String line;
        while ((line = bf.readLine()) != null) {
            op.append(line);

        }
        System.out.println(op.toString());
        bf.close();
    }

}
