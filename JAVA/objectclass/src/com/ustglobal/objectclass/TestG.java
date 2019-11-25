package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Pen", "Ball pen", 5, "DOMS");
		Product p2 = new Product(2, "Pencil", "0.5hp", 5, "Apsara");
		Product p3 = new Product(1, "Pen", "Ball pen", 5, "DOMS");
		Product p4 = p2;
	}
}
