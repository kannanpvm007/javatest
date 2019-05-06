package com.kgisl.qs1.map;

public class Employee {

	private String id;
	private String name;
	private String age;
	private String country;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "\n {" + id + "::" + name + "::" + age + "::" + country + "} \n";
	}

	public void add(String[] rds) {
	}
}