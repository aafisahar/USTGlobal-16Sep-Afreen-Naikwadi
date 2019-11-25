package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Employee> p = s -> {
			if(s.salary > 30000) {
				return true;
			} else {
				return false;
			}
		};
		
		Employee e = new Employee("Aafi", 44, 50000);
		
		boolean b = p.test(e);
		System.out.println("Result : "+b);
	}
}
