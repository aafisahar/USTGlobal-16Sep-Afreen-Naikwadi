package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkesdList {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(14);
		l.add(33);
		l.add(29);
		l.add(18);
		
		System.out.println("Before sort "+l);
		Collections.sort(l);
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse "+ l);
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+ l);
		
		
		
	}
}
