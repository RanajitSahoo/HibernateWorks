package com.jsp.DriverTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.LifeCycle.Car;

public class SaveCar {

	public static void main(String[] args) {
		Car c=new Car(106,"AUDI",1500);
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(c);
		c.setName("Mercy");
		c.setName("zuhubi");
		em.remove(c);
		et.commit();
		
		em.detach(c);
		c.setName("tata");
		
	}

}
