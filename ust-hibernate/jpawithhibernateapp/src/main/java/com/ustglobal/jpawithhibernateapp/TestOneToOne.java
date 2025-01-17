package com.ustglobal.jpawithhibernateapp;

import javax.persistence.*;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(1);
		vc.setVname("Aafi");
		Person p = new Person();
		p.setPid(1);
		p.setPname("Aafi");
		p.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 1);
			System.out.println(vCard.getPerson().getPid());   //To retrieve a record
			//entityManager.persist(p);   To insert a record
			//System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
