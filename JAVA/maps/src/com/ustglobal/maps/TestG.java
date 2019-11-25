package com.ustglobal.maps;

import java.util.*;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Aafi", 1, 50000);
		Employee e2 = new Employee("Sadi", 2, 45000);
		Employee e3 = new Employee("Nish", 3, 35000);
		Employee e4 = new Employee("Afrya", 4, 30000);
		Employee e5 = new Employee("Shruti", 5, 27000);
		Employee e6 = new Employee("Minnu", 6, 40000);
		Employee e7 = new Employee("Farru", 7, 38000);
		Employee e8 = new Employee("Sumayya", 8, 25000);
		Employee e9 = new Employee("Misba", 9, 20000);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Employee> first = hm.get("first");
		
		System.out.println("Employees under Manager1 : ");
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			
			Employee s= it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("..............................");
		}
		
		System.out.println("----------------------------------");
		
		ArrayList<Employee> second = hm.get("second");
		System.out.println("Employees under Manager2 : ");
		Iterator<Employee> it2 = second.iterator();
		while(it2.hasNext()) {
			
			Employee s= it2.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("..............................");
		}
		
		System.out.println("----------------------------------");
		
		ArrayList<Employee> third = hm.get("third");
		System.out.println("Employees under Manager3 : ");
		Iterator<Employee> it3 = third.iterator();
		while(it3.hasNext()) {
			
			Employee s= it3.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("..............................");
		}
	}
}
