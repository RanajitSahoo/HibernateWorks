package com.jsp.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.ClassRoom;
import com.jsp.dto.School;
import com.jsp.util.Address;

public class ClassRoomDao {
	public void saveClassRoom(ClassRoom cl) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(cl);
		et.commit();

	}

	public ClassRoom getClassRoomById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		ClassRoom s = em.find(ClassRoom.class, id);
		et.commit();
		return s;
	}

	public List<ClassRoom> getClassRoomByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from ClassRoom s where s.name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<ClassRoom> list = q.getResultList();
		return list;

	}

	public List<ClassRoom> getAllClassRooms() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from ClassRoom s";
		Query q = em.createQuery(sql);
		List<ClassRoom> list = q.getResultList();
		return list;
	}

	public void deleteClassRoomById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		ClassRoom s = em.find(ClassRoom.class, id);
		em.remove(s);
		et.commit();

	}

	public ClassRoom updateClassRoom(ClassRoom cl) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		System.out.println("Enter the classroom name");
		String name = sc.nextLine();
		cl.setName("10th");
		ClassRoom s = em.merge(cl);
		et.commit();
		return s;
	}
}
