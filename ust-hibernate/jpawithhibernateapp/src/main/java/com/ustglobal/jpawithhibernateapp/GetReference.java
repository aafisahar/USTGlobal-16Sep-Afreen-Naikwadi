package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product prod = entityManager.getReference(Product.class, 1);
		System.out.println("Id : "+prod.getPid());
		System.out.println("Name : "+prod.getPname());
		System.out.println("Quantity : "+prod.getQuantity());
		entityManager.close();
	}
}
