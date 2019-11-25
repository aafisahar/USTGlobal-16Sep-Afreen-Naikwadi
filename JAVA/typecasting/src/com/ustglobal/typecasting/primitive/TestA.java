package com.ustglobal.typecasting.primitive;

public class TestA {
   public static void main(String[] args) {
	byte a = 10;
	int b = a;   // Implicit casting
	System.out.println("b is "+b);
	int p = 20;
	double q = p;
	System.out.println("b is "+b);
	System.out.println("------------------------------");
	
	double x = 20.54;
	int y = (int) x;    // Explicit Casting
	System.out.println("y is "+y);
	byte z = (byte) x;
	System.out.println("z is "+z);
	char c = (char) x;
	System.out.println("c is "+c);
   }
}
