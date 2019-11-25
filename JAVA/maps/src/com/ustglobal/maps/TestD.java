package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("belgaum", 590010);
		lh.put("bangalore", 560068);
		lh.put("haryana", 888000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer val = m.getValue();
			System.out.println("key is "+key+" --- "+" Value is "+val);
		}
		
		
	}
}
