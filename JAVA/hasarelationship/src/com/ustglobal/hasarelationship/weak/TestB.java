package com.ustglobal.hasarelationship.weak;

public class TestB {
   
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.name);
		c.drive();
		
		System.out.println("---------------------");
		
		c.m.playMusic();
		System.out.println(c.m.size);
	}
}
