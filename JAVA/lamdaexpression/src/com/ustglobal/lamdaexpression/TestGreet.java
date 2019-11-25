package com.ustglobal.lamdaexpression;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface g1 = (msg)->{
			System.out.println("Hi");
			System.out.println(msg);
		};
		 g1.greet("Afreen");
		
	}
}
