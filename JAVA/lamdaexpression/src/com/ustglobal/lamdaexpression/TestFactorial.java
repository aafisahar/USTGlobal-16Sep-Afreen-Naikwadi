package com.ustglobal.lamdaexpression;

public class TestFactorial {

	public static void main(String[] args) {
		
		FactorialInterface fct = a->{
			int fact = 1;
			while(a>0) {
				fact = fact * a;
				a--;
			}
			return fact;
		};
		
		int facto = fct.factorial(4);
		System.out.println(facto);
	}
}
