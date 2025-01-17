package com.ustglobal.jpawithhibernateapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
	
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		    entityManager = entityManagerFactory.createEntityManager();
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    Product prod = entityManager.find(Product.class, 1);
		    prod.setPname("Mobile");
		    System.out.println("Updated Record");
		    entityTransaction.commit();
		
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
