package com.ustglobal.lamdaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface mul = (a,b)->a*b;
		int product = mul.multiply(20, 2);
		System.out.println(product);
	}
}
