package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(22.44);
		al.add(true);
		al.add("Ayyu");
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = it.next();
		System.out.println("obj2 "+o2);
		
		Object o3 = it.next();
		System.out.println("obj3 "+o3);
		
		Object o4 = it.next();
		System.out.println("obj4 "+o4);
		
		
		System.out.println("------using for-each loop------");
		for(Object obj : al) {
			System.out.println(obj);
		}
		
		ArrayList all = new ArrayList();
		all.add(6);
		all.add(244.88);
		all.add("Ammi");
		all.add(true);
		
		System.out.println("-------using iterator----");
		
		Iterator it1 = all.iterator();
		
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		
//		System.out.println("-------using for-loop----");
//		
//		for(;it1.hasNext();) {
//			Object oj = it1.next();
//			System.out.println(oj);
		}
	}

