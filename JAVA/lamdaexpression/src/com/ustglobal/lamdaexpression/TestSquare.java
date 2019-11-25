package com.ustglobal.lamdaexpression;

public class TestSquare {

	public static void main(String[] args) {
		
		SquareInterface s = x->x*x;
		int sqr = s.square(4);
		System.out.println(sqr);
	}
}
