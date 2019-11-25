package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		ts.add(43);
		ts.add(54);
		ts.add(21);
		ts.add(9);
		ts.add(93);
		ts.add(9);
		
		System.out.println("---------using for-each-------------");
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("---------using iterator-------------");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
