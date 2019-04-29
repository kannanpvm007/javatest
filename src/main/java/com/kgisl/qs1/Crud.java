package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Exercise 6:
Class Employee{
int empid;
String name;
String dept;
float salary;
}

CRUD operations in ArrayList

*/

public class Crud {

    static ArrayList<Operation> slist = new ArrayList<Operation>();

    public static void main(String[] args) {
        create();
        read();
        update();
        delete();

    }

    static void create() {

        System.out.println(slist.isEmpty());

        slist.add(new Operation(522, "Anand", "EEE", 10000));

        slist.add(new Operation(633, "Krishna", "IT", 12000));

        slist.add(new Operation(548, "gk", "CSE", 10000));

        slist.add(new Operation(369, "raju", "ECE", 10000));

    }

    private static void update() {
        slist.set(1, new Operation(255, "Raju", "ECE", 36000));
        System.out.println("The Updated slistay list is :");
        for (Operation var : slist) {
            System.out.println(var.empid + " " + var.name + " " + var.Salary + " " + var.dept);
        }
    }

    private static void delete() {
        slist.clear();
        System.out.println(slist);
    }

    static void read() {
        System.out.println("The Created Array List is");
        for (Operation var : slist) {
            System.out.println(var.empid + " " + var.name + " " + var.Salary + " " + var.dept);

        }
    }

}