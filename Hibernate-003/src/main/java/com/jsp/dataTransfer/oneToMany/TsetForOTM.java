package com.jsp.dataTransfer.oneToMany;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TsetForOTM {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccNumber("182787338191982");
		a1.setBankName("SBI");
		Account a2=new Account();
		a2.setAccNumber("2737836823");
		a2.setBankName("Fedral");
		Account a3=new Account();
		a3.setAccNumber("273768376836");
		a3.setBankName("PNB");
		Account a4=new Account();
		a4.setAccNumber("76447888237");
		a4.setBankName("AXIS");
		
		List<Account> list=new LinkedList<Account>();
		list.add(a1);
		list.add(a4);
		
		Persons p=new Persons();
		p.setName("Raja");
		p.setAge(26);
		p.setLoc("Bangalore");
		p.setList(list);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		
		et.commit();
		
		System.out.println("data added");
		
		
		

	}

}
