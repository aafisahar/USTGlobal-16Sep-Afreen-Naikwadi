package com.ustglobal.objectclass;

public class TestD {
 
	public static void main(String[] args) {
		
		Car c1 = new Car(75000000, "BMW", "Black");
		System.out.println(c1);
		
		int h1 = c1.hashCode();
		System.out.println(h1);
		
		Car c2 = new Car(550000000, "Ferrari", "Red");
		System.out.println(c2);
		
		int h2 = c2.hashCode();
		System.out.println(h2);
		
		Car c3 = new Car(123000000, "Audi", "White");
		System.out.println(c3);
		
		int h3 = c3.hashCode();
		System.out.println(h3);
	}
	
}
