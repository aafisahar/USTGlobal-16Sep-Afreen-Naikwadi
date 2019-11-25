package com.ustglobal.objectclass;

public class Student {

	int id;
	String name;
	double perc;
	
	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	
	@Override
	public String toString() {
		return "Name is "+name+ " Id is "+id+" Percentage is "+perc;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
