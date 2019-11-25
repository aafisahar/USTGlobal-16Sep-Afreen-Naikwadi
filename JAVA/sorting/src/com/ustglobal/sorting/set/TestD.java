package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(23.44);
		ls.add(480.2);
		ls.add(56.8);
		ls.add(94.1);
		ls.add(67.90);
		
		System.out.println("---------using for-each-------------");
		for(Double o : ls) {
			System.out.println(o);
		}
		
		System.out.println("---------using iterator-------------");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double s = it.next();
			System.out.println(s);
		}
	}
}
