package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<>();
		al.add(88.9);
		al.add(20.45);
		al.add(123.5);
		al.add(44.56);
		al.add(88.9);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		al.add(2, 22.4);
		System.out.println("After add in 2nd index "+ al);
		
		al.remove(0);
		System.out.println("After removing 0th index "+ al);
		al.remove(null);
		System.out.println("After removing null "+ al);
		Double d = al.get(4);
		System.out.println("Object at 4th index "+d);
		al.set(2, 98.9);
		System.out.println("After replacing 2nd index "+ al);
		al.clear();
		System.out.println("After clear method "+ al);
		al.contains(44.56);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.4);
		al1.add(34.5);
		al1.add(11.3);
		
		al.addAll(al1);
		System.out.println("After add all "+al);
		
		boolean con = al.containsAll(al1);
		System.out.println("After contains all "+ con);
		
		boolean res = al.removeAll(al1);
		System.out.println("After remove all of al1 "+ res);
		System.out.println("After remove "+al);
	}
}
