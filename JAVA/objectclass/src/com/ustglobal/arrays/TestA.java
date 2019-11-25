package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num[3] =40;
		num[4] =50;

		for(int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("----------------");

		int[] num2 = {50,40,30,20,10};
		for(int n : num2) {

			System.out.println(n);
		}

		System.out.println("----------------");

		char[] c = {'a','b','c','d','e','f'}; 
		for(char i : c) {

			System.out.println(i);
		}
		System.out.println("----------------");
		boolean[] b = {true,false,true,false};
		for(boolean b1 : b) {

			System.out.println(b1);
		}
		System.out.println("----------------");

		byte[] bt = {1,2,3,4};
		for(byte i : bt) {

			System.out.println(i);
		}
		System.out.println("----------------");

		double[] d = {1.1,2.2,3.3,4.4};
		for(double i : d) {

			System.out.println(i);
		}
		System.out.println("----------------");
		
		String[] s = {"Aafi","Sufi","Ayyu"};
		for(String i : s) {

			System.out.println(i);
		}
	}
}
