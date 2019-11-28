package com.ustglobal.jpawithhibernateapp;

import java.util.List;

import javax.persistence.*;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToMany {

	public static void main(String[] args) {
		
		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("Apsarar");
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("black");
		p1.setPencilBox(pbox);
		
		Pencil p2 = new Pencil();
		p2.setPid(12);
		p2.setColor("red");
		p2.setPencilBox(pbox);
	
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p1); 
			entityManager.persist(p2);  //To insert a record
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
    }
}
