package com.jsp.ManytoOneTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ManytoOneUtility.Student;
import com.jsp.ManytoOneUtility.Subject;

public class MTOTest {

	public static void main(String[] args) {
		Subject s=new Subject();
		s.setSubAuth("Kisore Sir");
		s.setSubName("MERN");
		
		Student st=new Student();
		st.setMark(79);
		st.setStudAge(26);
		st.setStudName("Raja");
		st.setStudSub(s);
		Student st1=new Student();
		st1.setMark(87);
		st1.setStudAge(24);
		st1.setStudName("abdul");
		st1.setStudSub(s);
		Student st2=new Student();
		st2.setMark(98);
		st2.setStudAge(24);
		st2.setStudName("sinu");
		st2.setStudSub(s);
		Student st3=new Student();
		st3.setMark(99);
		st3.setStudAge(23);
		st3.setStudName("suhana");
		st3.setStudSub(s);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(st);
		em.persist(st1);
		em.persist(st2);
		em.persist(st3);
		et.commit();
		System.out.println("data added successfully");
		
	}

}
