package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectPerticularColumn {
 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
			
		List<String> li = query.getResultList();
		for(String l : li) {
			System.out.println(l);
		}
		
		entityManager.close();	
	}
}
