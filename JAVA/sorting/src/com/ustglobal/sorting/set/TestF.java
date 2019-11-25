package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
 
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Sufi");
		ts.add("Shifa");
		ts.add("Ayan");
		ts.add("Minnu");
		ts.add("Aafi");
		
		System.out.println("---------using for-each-------------");
		for(String o : ts) {
			System.out.println(o);
		}
		
		System.out.println("---------using iterator-------------");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
