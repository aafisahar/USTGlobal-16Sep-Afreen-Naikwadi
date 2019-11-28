package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class InsertDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(1);
		s.setName("Aafi");
		s.setBranch("EEE");
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s);
			System.out.println("Record Inserted");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
