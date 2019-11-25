package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Pen> a = new ArrayList<>();
		
		Pen p1 = new Pen(10, "Natraj");
		Pen p2 = new Pen(5, "Cello");
		Pen p3 = new Pen(3, "Doms");
		Pen p4 = new Pen(15, "Streamer");
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		
		System.out.println("before sorting---> ");
		displayPenDetails(a);
		System.out.println("after sorting---> ");
		Collections.sort(a);
		displayPenDetails(a);
		
	}
	
	static void displayPenDetails(ArrayList<Pen> a) {
		Iterator<Pen> it = a.iterator();
		while(it.hasNext()) {
			Pen lp = it.next();
			System.out.println("Brand is "+lp.brand);
			System.out.println("Price is "+lp.price);
			System.out.println("---------------------");
		}
	}
}
