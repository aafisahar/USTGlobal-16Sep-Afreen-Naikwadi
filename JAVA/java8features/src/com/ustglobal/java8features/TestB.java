package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		  
		Predicate<Student> p = s -> {
			if(s.perc >= 35) {
				return true;
			} else {
				return false;
			}
		};
		
		Student s = new Student(1, "minnu", 78.6);
		boolean b = p.test(s);
		System.out.println("Result : "+b);
	}
}
