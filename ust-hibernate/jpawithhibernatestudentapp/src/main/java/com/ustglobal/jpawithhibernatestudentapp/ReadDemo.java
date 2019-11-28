package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		Student s = entityManager.find(Student.class, 1);
		System.out.println("Id : "+s.getId());
		System.out.println("Name : "+s.getName());
		System.out.println("Branch : "+s.getBranch());
		entityManager.close();
		
	}
}
