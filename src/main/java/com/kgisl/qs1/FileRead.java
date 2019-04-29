package com.kgisl.qs1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * FileRead
 */
// Java Program to illustrate reading from FileReader
// using Scanner Class reading entire File
// without using loop


public class FileRead {
    public static void main(String[] args) 
    throws FileNotFoundException {
        File hi = new File("D:/Kannan/test1/src/main/java/com/kgisl/qs1/hi.txt");
       
        Scanner sc = new Scanner(hi);
        sc.useDelimiter("\\Z");
        System.out.print(sc.next());
        
        
    }
}