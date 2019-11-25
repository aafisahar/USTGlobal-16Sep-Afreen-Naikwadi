package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4};
//		System.out.println(num[10]);  ArrayIndexOutOfBounceException
		
		recieve(num);
		System.out.println("----------------------");
		
		int[] vals = getArray();
		
		for(int v : vals) {
			System.out.println(v);
		}
		
		System.out.println("----------------------");
		
		String[] s = {"A","B","C"};
		
		recieveStr(s);
		System.out.println("----------------------");
		
		String[] s2 = getArrayStr();
		
		for(String st : s2) {
			System.out.println(st);
		}
		
	}
	
	static void recieve(int[] nums) {
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
	
	static int[] getArray() {
		int[] val = {20,30,40,50};
		return val;
	}
	
static void recieveStr(String[] s) {
		
		for(String n : s) {
			System.out.println(n);
		}
	}
	
	static String[] getArrayStr() {
		String[] s1 = {"Aa","Bb","Cc"};
		return s1;
	}
}
