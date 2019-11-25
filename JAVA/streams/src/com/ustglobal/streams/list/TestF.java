package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(3);
		al.add(44);
		al.add(97);
		al.add(53);
		al.add(22);
		al.add(10);
		al.add(71);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("sorted ---->");
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}
}
