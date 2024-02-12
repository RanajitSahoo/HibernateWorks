package com.jsp.DriverTest;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.CompositeKey.CompositeKeyForStudent;
import com.jsp.CompositeKey.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		CompositeKeyForStudent c=new CompositeKeyForStudent();
		c.setSid(102);
		c.setName("Raja");
;		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		Student e=em.find(Student.class,c);
		System.out.println(e);

	}

}
