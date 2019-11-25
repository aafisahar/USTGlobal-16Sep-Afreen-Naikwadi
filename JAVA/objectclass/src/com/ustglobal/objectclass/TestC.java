package com.ustglobal.objectclass;

public class TestC {

	public static void main(String[] args) {
		
		Student s1 = new Student(44, "Afreen", 82.45);
		int h = s1.hashCode();
		System.out.println(h);
		System.out.println(s1);
	}
}
