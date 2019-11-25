package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(3);
		al.add(44);
		al.add(97);
		al.add(53);
		al.add(22);
		al.add(10);
		al.add(71);
		
		List<Integer> l = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		for(Integer i : l) {
			
			System.out.println(i);
		}
		
		
	}
}
