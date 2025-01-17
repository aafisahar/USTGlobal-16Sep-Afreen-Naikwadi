package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.*;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class SelectAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);
		
		List<Product> prod = query.getResultList();
		
		for(Product p : prod) {
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getQuantity());
		}
		
		entityManager.close();
	}
}
