package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<>();
		al.add(new Marker(50, "Blue"));
		al.add(new Marker(60, "Black"));
		al.add(new Marker(70, "Red"));
		al.add(new Marker(80, "Green"));
		
		System.out.println("before sorting---> ");
		display(al);
		
//		SortByPrice sb = new SortByPrice();
//		Collections.sort(al, sb);
		
		SortByColor sc = new SortByColor();
		Collections.sort(al, sc);
		
		System.out.println("after sorting---> ");//descending order
		display(al);
	}
	
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker lp = it.next();
			System.out.println("Brand is "+lp.color);
			System.out.println("Price is "+lp.price);
			System.out.println("---------------------");
		}
	}
}
