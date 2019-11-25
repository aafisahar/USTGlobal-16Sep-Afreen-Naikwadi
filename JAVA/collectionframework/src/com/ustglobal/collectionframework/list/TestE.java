package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aafi");
		al.add("Sufi");
		al.add("Ayan");
		al.add("Minnu");
		
		String s = al.get(2);
		System.out.println(s.toUpperCase());
		
		System.out.println("------iterator---");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
		
		System.out.println("------List iterator---");
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			String s1 = li.next();
			System.out.println(s1);
		}
		
		System.out.println("-------for each---");
		for(String s2 : al) {
			
			System.out.println(s2);
		}
		
	}
}
