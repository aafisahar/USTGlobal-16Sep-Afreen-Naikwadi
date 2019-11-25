package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(404, "Jini");
		ht.put(800, "Aafi");
		ht.put(90, "Sufi");
		ht.put(6, "Ayyu");
		ht.put(404, "Sam");
//		ht.put(null, "Minnu"); NullPoinerException
//		ht.put(410, null); NullPoinerException
		
		System.out.println("Data "+ht);
	}
	
}
