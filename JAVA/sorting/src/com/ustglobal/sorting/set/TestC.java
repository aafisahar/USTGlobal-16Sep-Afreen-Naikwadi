package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add(34);
		ls.add("Fatima");
		ls.add(89.43);
		ls.add("Malik");
		ls.add(null);
		ls.add(null);
		ls.add(34);
		
		System.out.println("---------using for-each-------------");
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("---------using iterator-------------");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
