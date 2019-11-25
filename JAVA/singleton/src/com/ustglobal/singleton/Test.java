package com.ustglobal.singleton;

public class Test {

	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDBConnection();
		ms.s = "hello";
		System.out.println("Hashcode of ms "+ms.hashCode());
		
		MySingleton mx = MySingleton.getDBConnection();
		mx.s = "Hi";
		System.out.println("Hashcode of mx "+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
		
	}
}
