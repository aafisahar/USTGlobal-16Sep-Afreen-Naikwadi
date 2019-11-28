package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.*;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("Java");
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("SQL");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(c1);
		alCourses.add(c2);
		
		Student s = new Student();
		s.setSid(144);
		s.setSname("Sahar");
		s.setCourse(alCourses);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s); 
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
