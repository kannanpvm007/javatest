package com.kgisl.qs1.dbex.datasource;

/**
 * Student
 */
public class StudentDB {
    private String id;
    private String name;
    private String dep;
    private String college;

    public String getId() {
        return id;
    }

    /**
     * @param rd the id to set
     */
    public void setId(String id) {
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
        return id +" "+name+" " + dep+" "+college+" ";

 }
}