package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {

	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
			System.out.println("-------------------------");
		};
		
		Student s1 = new Student(4, "Sufi", 78.44); 
		c.accept(s1);
	}
}
