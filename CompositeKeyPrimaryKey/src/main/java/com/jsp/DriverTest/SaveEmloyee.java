package com.jsp.DriverTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.CompositeKey.CompositeKeyForEmployee;
import com.jsp.CompositeKey.Employee;

public class SaveEmloyee {

	public static void main(String[] args) {
		CompositeKeyForEmployee cpk=new CompositeKeyForEmployee(101,"ranajit");
		
		Employee e=new Employee();
		e.setCpk(cpk);
		e.setAge(26);
		e.setSal(20000);
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(e);
		et.commit();
		System.out.println("success");

	}

}
