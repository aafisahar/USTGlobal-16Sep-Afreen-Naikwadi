package com.ustglobal.maps;

import java.util.*;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("belgaum", 590010);
		lh.put("bangalore", 560068);
		lh.put("haryana", 888000);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("Key "+key);
		}
		
		System.out.println("----------------------");
		
		Collection<Integer> c = lh.values();
		for(Integer val : c) {
			System.out.println("Value "+val);
		}
	}
}
