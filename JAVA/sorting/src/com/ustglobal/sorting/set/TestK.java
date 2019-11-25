package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(42);
		pq.offer(53);
		pq.offer(1);
		
		System.out.println("Before poll "+pq);
		System.out.println("---------using iterator-------------");
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		
		System.out.println("After poll "+pq);
		
	}
}
