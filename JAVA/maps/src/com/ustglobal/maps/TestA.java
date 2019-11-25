package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	 public static void main(String[] args) {
		 
		HashMap hm = new HashMap();
		hm.put("Sufi", 7890234567l);
		hm.put("Ayan", 8792718311l);
		hm.put("Aafi", 7892564632l);
		hm.put(null, 9786543210l);
		hm.put(null, 8907654321l);
		
		System.out.println("Data "+hm);
		System.out.println("-----------------------------------");
		
		hm.put("Sufi", 8792434724l);
		System.out.println("After modify "+hm);
		System.out.println("-----------------------------------");
		
		hm.put("Minnu", 7892564632l);
		System.out.println("After putting minnu "+hm);
		System.out.println("-----------------------------------");
		
		Object phno = hm.get("Aafi");
		System.out.println("value "+phno);
		System.out.println("-----------------------------------");
		Object phno2 = hm.get("Afreen");
		System.out.println("value "+phno2);
		System.out.println("-----------------------------------");
		
		Object val = hm.remove("Aafi");
		System.out.println("Value "+val);
		
		System.out.println("After remove---> "+hm);
		
		
		
	}
}
