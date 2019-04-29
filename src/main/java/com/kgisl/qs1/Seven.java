package com.kgisl.qs1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {

        System.out.println("welcome to TNEB:");
        Scanner se = new Scanner(System.in);

        System.out.println("Enter Customer IDNO: ");
        int id = se.nextInt();

        System.out.println("enter Customer Name: ");
        String name = se.next();

        System.out.println("enter used unit :");
        float unit = se.nextFloat();

        // System.out.println("Customer IDNO :"+
        // "Customer Name :"+
        // "unit Consumed :" +
        // " Amount Charges @ Rs." + "unit :" +
        // "Surchage Amount :" +
        // " Net Amount Paid By the Customer :" );

        if (unit < 199) {
            float q = 1.20f;
            float p = unit * q;
            if (p > 100) {
                System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                        + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n"
                        + " Net Amount Paid By the Customer :100" + "/n minimam bill 100*");
            } else {
                System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                        + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +

                        " Net Amount Paid By the Customer :" + p);
            }

            // System.out.println(" ");

        } else if (unit >= 200 && unit < 400) {

            float q = 1.50f;
            float p = unit * q;
            if (p > 400) {
                float dis = p - (p * 15 / 100);
                System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                        + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +

                        " Net Amount Paid By the Customer :" + dis+"\n U have 15% discount happy day!!!");

            } else {
                System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                        + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +

                        " Net Amount Paid By the Customer :" + p );
            }}


            else if (unit >= 400 && unit < 600) {

                float q = 1.80f;
                float p = unit * q;
                if (p > 400) {
                    float dis = p - (p * 15 / 100);
                    System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                            + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +
    
                            " Net Amount Paid By the Customer :" + dis+"\n U have 15% discount happy day!!!");
    
                } else {
                    System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                            + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +
    
                            " Net Amount Paid By the Customer :" + p + "\n U have 15% discount happy day!!!");
                }
         


        } else if (unit > 600) {
            float q = 2f;
            float p = unit * q;
            if (p > 400) {
                float dis = p - (p * 15 / 100);
                System.out.println("Customer IDNO :" + id + "\n" + "Customer Name :" + name + "\n" + "unit Consumed :"
                        + unit + "\n" + " Amount Charges @  Rs." + p + "unit :" + q + "\n" +

                        " Net Amount Paid By the Customer :" + dis + "\n U have 15% discount happy day!!!");

            }
        }

    }

}