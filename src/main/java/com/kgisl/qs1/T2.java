package com.kgisl.qs1;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

/**
 * Exercise 2: This program prints conversion tables. Type a letter to select a
 * conversion table m miles to kilometers k kilometers to miles
 * 
 * miles kilometers 10.00 16.09
 * 
 * kilometers miles 10.00 6.21
 * 
 */
public class T2 {
    public static void main(String[] args) {
        System.out.print(" prees ==>m  to miles to kilometers \n press => K to kilometers to miles ");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        System.out.println("enter value ");
        Double v = sc.nextDouble();

        Double mi = 1.60934;
        Double km= 0.621371;
        switch (key) {

        case "k":
            System.out.print("miles TO  " +v+" Kilometers :"+v * mi);

            break;
         case "m":  System.out.print("Kilometers TO  " +v+" miles :"+v * km); break;
          default : System.out.println(" type valid key"); break;
       
        

         
  
        }
    }
}
