package com.jsp.DriverTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.CompositeKey.Student;



public class SaveStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(102);
		s1.setName("Raja");
		s1.setMarks(99);
		s1.setLoc("Marathalli");
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(s1);
		et.commit();
		System.out.println("success");

	}

}
