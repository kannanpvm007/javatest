package com.kgisl.qs1.dbex.datasource;

/**
 * Student
 */
public class Student {
    private int id;
    private String name;
    private String dep;
    private String college;

    Student(int i, String string, String string2, String string3){ 
    
    this.id=id;
    this.name=name;
    this.dep=dep;
    this.college=college;

    }
    public int getId() {
        return id;
    }

    /**
     * @param rd the id to set
     */
    public void setId(String rd) {
        this.id = id;
    }
    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the dep
     */
    public String getDep() {
        return dep;
    }

    /**
     * @param dep the dep to set
     */
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
   
 public String toString(){
        return id +" id"+name+" name" + dep+"dep"+college+"college";

 }
}