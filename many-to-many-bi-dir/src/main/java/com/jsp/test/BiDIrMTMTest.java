package com.jsp.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Student;
import com.jsp.entities.Subject;

public class BiDIrMTMTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Raja");
		s1.setAge(26);
		Student s2=new Student();
		s2.setName("madhu");
		s2.setAge(22);
		Student s3=new Student();
		s3.setName("abdu");
		s3.setAge(24);
		Student s4=new Student();
		s4.setName("suhana");
		s4.setAge(20);
		
		List<Student> list1= new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		List<Student> list2= new ArrayList<Student>();
		list2.add(s4);
		list2.add(s3);
		
		Subject sb1=new Subject();
		sb1.setName("java");
		sb1.setTrainers("Raveesh sir");
		Subject sb2=new Subject();
		sb2.setName("MERN");
		sb2.setTrainers("Kishore sir");
		Subject sb3=new Subject();
		sb3.setName("Python");
		sb3.setTrainers("Santosh sir");
		
		List<Subject> list3= new ArrayList<Subject>();
		list3.add(sb1);
		list3.add(sb2);
		List<Subject> list4= new ArrayList<Subject>();
		list4.add(sb3);
		list4.add(sb2);
		
		s1.setListSub(list4);
		s2.setListSub(list3);
		s3.setListSub(list3);
		s4.setListSub(list4);
		
		sb1.setListStud(list2);
		sb2.setListStud(list1);
		sb3.setListStud(list1);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(sb1);
		em.persist(sb2);
		em.persist(sb3);
		et.commit();
		
	}

}
