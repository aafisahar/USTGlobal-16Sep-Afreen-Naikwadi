package com.ustglobal.maps;

import java.util.*;

public class TestE {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<>();
		lh.put("haryana", 888000);
		lh.put("bangalore", 560068);
		lh.put("belgaum", 590010);
//		lh.put(null, 888000); NullPointerException
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer val = m.getValue();
			System.out.println("key is "+key+" --- "+" Value is "+val);
		}
		
		
	}
}
