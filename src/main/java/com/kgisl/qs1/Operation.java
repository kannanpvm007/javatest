package com.kgisl.qs1;
/**
 * Operation
 */
public class Operation {
    int empid;
    String name;
    String dept;
    Float Salary;

    Operation(int empid, String name, String dept, float Salary) {
        this.empid = empid;
        this.name = name;
        this.dept = dept;
        this.Salary = Salary;
    }

    public int getid() {
        return empid;
    }

    public void setid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float Salary) {
        this.Salary = Salary;
    }

    public String getDep() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}