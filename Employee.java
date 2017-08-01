package com.model.employee;

public class Employee {
	
	private Integer Id;
	private String name;
	private Float gpa;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getGpa() {
		return gpa;
	}
	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
        return String.format("%s\t%s\t%f", Id, name,  gpa);
    }


}
