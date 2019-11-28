package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.*;

public class UpdateDemo {

	 public static void main(String[] args) {
		 EntityManager entityManager = null;
		 EntityTransaction entityTransaction = null;
		 
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "update Product set pname='Mobile' where pid=1";
			Query query = entityManager.createQuery(jpql);
			int res = query.executeUpdate();
			System.out.println(res+" Record Updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
