package com.kgisl.qs1.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Findbigfile
 */
public class Findbigfile {

    public static void main(String[] args) throws FileNotFoundException {
      new Findbigfile().Langword();

    }

    public String Langword() throws FileNotFoundException {

        String langword="";
        String corrnt;
        Scanner sc = new Scanner(new File("C:\\Users\\kannan.r\\Desktop\\RW\\ok.csv"));
        while(sc.hasNext()){
            corrnt =sc.next();
            if(corrnt.length()>langword.length()){
                langword = corrnt;

            }
        }

            System.out.println("big word"+langword);
        return langword;

    }
}