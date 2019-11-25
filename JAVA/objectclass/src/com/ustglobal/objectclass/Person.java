package com.ustglobal.objectclass;

public class Person implements Cloneable {

	String name;
	int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
