package com.jsp.test;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Entityclasses.Person;

public class Test3UsingPositionParameter {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		String jpql="select p from Person p where p.name=?1 and p.age=?2";//positin parameter
		Query q= em.createQuery(jpql);
		q.setParameter(1, "Ranajit");
		q.setParameter(2, 26);
		Person p=em.find(Person.class, 1);
		System.out.println(p);
//		Person o=(Person)q.getSingleResult();//when we know only unique data is present in database the we use getSingleResult()
//		System.out.println(o);
//		List list=q.getResultList();
//		
//		if(!list.isEmpty()) {
//			ListIterator li=  list.listIterator();
//			while(li.hasNext()) {
//				System.out.println(li.next());
//			}
//		}
//		else {
//			System.out.println("-----0");
//		}
	}

}
