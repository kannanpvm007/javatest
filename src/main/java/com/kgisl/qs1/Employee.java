package com.kgisl.qs1;

/**
 * Class Employee{ int empid; String name; String dept; float salary; }
 * 
 * CRUD operations in ArrayList
 * 
 */


public class Employee {
    int empid;
    String name;
    String dept;
    float salary;

    Employee(String name, String dept, int empid, float salary) {
       this.name =name;
        empid=this.empid;
        dept =this.dept;
        salary=this.salary;

    }
    public String getName()
    {
        return name;

    }


    public int getEmpid()
    {
        return empid;

    }
    public String getDept()
    {
        return dept;

    }
    public float getSalary()
    {
        return salary;

    }
     
    public String toString() {

        return ("name"+ name+" dept"+ dept + "empid"+empid+"salary"+salary);

    }
}

    

    