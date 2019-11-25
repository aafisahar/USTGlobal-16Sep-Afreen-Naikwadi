package com.ustglobal.objectclass;

public class TestB {

	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(h);
		System.out.println(s);
		System.out.println(m);
		
		int a = 10;
		System.out.println(a);
	}
}
