package com.jsp.DriverTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.CompositeKey.CompositeKeyForEmployee;
import com.jsp.CompositeKey.Employee;
import com.jsp.CompositeKey.Student;

public class UpdateEmployee {

	public static void main(String[] args) {
		CompositeKeyForEmployee cp=new CompositeKeyForEmployee(101,"ranajit");
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		Employee e=em.find(Employee.class,cp);
		System.out.println(e);
	}

}
