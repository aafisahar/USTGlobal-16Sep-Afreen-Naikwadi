package com.ustglobal.beanobject;

public class TestA {
	public static void main(String[] args) {

		Student s = new Student();
		s.setId(4);
		s.setName("Afreen");
		s.setRollno(50);

		Database db = new Database();
		db.receive(s);
		
		System.out.println("----------------------------");
		
		Employee e = new Employee();
		e.setEid(44);
		e.setName("Afreen");
		e.setSalary(400000);
		e.setDept("Developement");
		e.setDesignation("Java Full Stack Developer");
		
		Database2 db2 = new Database2();
		db2.save(e);
	}
}
