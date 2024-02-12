package com.jsp.dataTransfer.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestForUniverOTM {

	public static void main(String[] args) {
		List<Department> listOfDept=new ArrayList<Department>();
		Department d1=new Department();
		d1.setDname("MCA");
		d1.setNoOfStudent(230);
		Department d2=new Department();
		d2.setDname("BCA");
		d2.setNoOfStudent(330);
		Department d3=new Department();
		d3.setDname("BBA");
		d3.setNoOfStudent(430);
		Department d4=new Department();
		d4.setDname("MBA");
		d4.setNoOfStudent(130);
		listOfDept.add(d4);
		listOfDept.add(d1);
		
		University u=new University();
		u.setUname("SOA University");
		u.setUemp(3400);
		u.setUloc("ITER,BBSR");
		u.setDeptList(listOfDept);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		et.begin();
		em.persist(u);
		em.persist(d1);
		em.persist(d4);
		em.persist(d2);
		em.persist(d3);
		et.commit();
		System.out.println("data added to database");
		
		
		
	}

}
