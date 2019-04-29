package com.kgisl.qs1;

/**
Exercise 4:
Demonstrate Constructor Chaining for the following class
Class Employee{
int empid;
String name;
float salary;
}

 */ 

public class T4 {

}

 class Emp {
    int id;
    String name;
  
    float salary;

    public Emp() {
        this("kannan");
    }

    public Emp(String name) {
        this(name, 1);
    }

    public Emp(String name, int id) {
        this(name, 1, 60000);
    }

    public Emp(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void print() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        Emp obj = new Emp();
        obj.print();

    }

}
