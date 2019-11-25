package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestK {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Aafi");
		al.add("nishi");
		al.add("sadi");
		al.add("Minnu");
		
		System.out.println("before sorting----> "+al);
		Collections.sort(al);
		System.out.println("after sorting----> "+al);
	}
}
