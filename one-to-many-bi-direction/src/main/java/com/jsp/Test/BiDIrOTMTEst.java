package com.jsp.Test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Account;
import com.jsp.Entities.Person;

public class BiDIrOTMTEst {

	public static void main(String[] args) {
		List<Account> list1=new ArrayList<Account>();
		Person p1=new Person();
		p1.setAge(23);
		p1.setName("Raja");
		
		Account a1=new Account();
		a1.setName("SBI");
		a1.setNumber(467823463);
		a1.setPerson(p1);
		Account a2=new Account();
		a2.setName("PNB");
		a2.setNumber(730948394);
		a2.setPerson(p1);
		Account a3=new Account();
		a3.setName("AXIs");
		a3.setNumber(328476732);
		a3.setPerson(p1);
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		p1.setListAcc(list1);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(p1);
		et.commit();

	}

}
