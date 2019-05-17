package com.kgisl.qs1.map;

import java.time.Year;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * Marks
 */
public class Marks {

    private int id;
    private int year;
    private int java;
    private int andro;
    private int php;
    private String name;
    private String  college;
    private String dep;

    Marks(int id, String name, String  college, String dep, int year, int java, int andro, int php) {

        this.id = id;
        this.name = name;
        this.dep = dep;
        // this. college= college;
        this. college =  college;
        this.year = year;
        this.java = java;
        this.php = php;
        this.andro = andro;

    }

    public Marks() {
	}

	public int getID() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhp() {
        return php;

    }

    public void setPhp(int php) {
        this.php = php;
    }

    public int getJava() {
        return java;

    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAndro() {
        return andro;

    }

    public void setAndro(int andro) {
        this.andro = andro;
    }

    public String getCllage() {
        return  college;

    }

    public void setCllage(String  college) {
        this. college =  college;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;

    }

    public void setDep(String dep) {
        this.dep = dep;

    } 
    @Override
    public String toString() {
        return id + " " + name + " " + college + " " + dep + " " + year + " " + java + " " + andro + " "
        + php;
    }
}