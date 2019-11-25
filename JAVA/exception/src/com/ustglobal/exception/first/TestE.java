package com.ustglobal.exception.first;

public class TestE {

	public static void main(String[] args) {
		System.out.println("main started");

		int[] a = {10,20,30};
		int b = 0;

		try {
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index not present");
		}
		try {
			System.out.println(b/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Number is divided by zero");
		}
		
		System.out.println("main ended");
	}
}
