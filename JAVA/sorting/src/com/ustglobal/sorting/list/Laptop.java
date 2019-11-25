package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {

	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	@Override
	public int compareTo(Laptop o) {
		String p = this.name;
		String q = o.name;
		return p.compareToIgnoreCase(q);
	}

//	@Override
//	public int compareTo(Laptop o) {
//		if(this.price>o.price) {
//		return 1;
//	}else if(this.price<o.price) {
//		return -1;
//	}else {
//		return 0;
//	}
//	}

//	@Override
//	public int compareTo(Laptop p) {
//		if(this.ram>p.ram) {
//			return 1;
//		}else if(this.ram<p.ram) {
//			return -1;
//		}else {
//			return 0;
//		}
	}
