package com.ustglobal.arrays;

public class TestC {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Aafi", 80.56);
		Student s2 = new Student(2, "Sufi", 79.66);
		Student s3 = new Student(3, "Ayyu", 82.01);
		
		Student[] st = new Student[3];
		
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		
		for(Student s : st) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------");
		receive(st);
	}
	
	static void receive(Student[] stu) {
		for(Student s : stu) {
			System.out.println(s);
		}
	}
}
