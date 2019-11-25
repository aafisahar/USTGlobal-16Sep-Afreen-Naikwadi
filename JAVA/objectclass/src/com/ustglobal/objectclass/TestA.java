package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		int phc = p.hashCode();
		
		System.out.println("HashCode of p is "+phc);
		
		Pen p1 = new Pen();
		int phc1 = p1.hashCode();
		
		System.out.println("HashCode of p1 is "+phc1);
	}
}
