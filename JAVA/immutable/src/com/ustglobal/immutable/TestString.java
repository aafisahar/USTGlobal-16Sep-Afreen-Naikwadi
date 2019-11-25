package com.ustglobal.immutable;

public class TestString {

	public static void main(String[] args) {
		
		MyString ms = new MyString(44, "Aafi");
		
		System.out.println(ms.getRollno());
		System.out.println(ms.getName());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(4, "Afreen");
		System.out.println(ms.getRollno());
		System.out.println(ms.getName());
		
		System.out.println("-----------------");
		
		System.out.println(ms1.getRollno());
		System.out.println(ms1.getName());
	}
}
