package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class DeleteDemo {
 
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
	    
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student s = entityManager.find(Student.class, 0);
			entityManager.remove(s);
			System.out.println("Record deleted");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}
}
