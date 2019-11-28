package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student s = entityManager.find(Student.class, 1);
			s.setName("Afreen");
			System.out.println("Record Updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
