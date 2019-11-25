package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Sufi");
		hs.add("Aafi");
		hs.add("Ayan");
		hs.add("Minnu");
		hs.add("Sadi");
		
		System.out.println("---------using for-each-------------");
		for(String o : hs) {
			System.out.println(o);
		}
		
		System.out.println("---------using iterator-------------");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
