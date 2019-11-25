package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Sufi", 7890234567l);
		hm.put("Ayan", 8792718311l);
		hm.put("Aafi", 7892564632l);
		
		HashMap hm1 = new HashMap();
		hm1.put("Amreen", 7890234567l);
		hm1.put("Siraj", 8792718311l);
		hm1.put("Sahar", 7892564632l);
		
		boolean haskey = hm.containsKey("Siraj");
		System.out.println("has key "+haskey);
		
		boolean hasval = hm.containsValue(7892564632l);
		System.out.println("Has Value "+hasval);
		
		System.out.println("-----------------------------------");
		hm.putAll(hm1);
		System.out.println("After put all "+hm);
		System.out.println(hm.size());
		boolean b = hm.isEmpty();
		System.out.println("map is empty "+b);
		
		hm.clear();
		System.out.println("After clear "+hm);
		
	}
}
