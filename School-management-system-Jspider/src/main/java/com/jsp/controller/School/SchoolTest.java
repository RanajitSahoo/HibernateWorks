package com.jsp.controller.School;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dao.ClassRoomDao;
import com.jsp.dao.SchoolDao;
import com.jsp.dto.ClassRoom;
import com.jsp.dto.School;
import com.jsp.util.Address;

public class SchoolTest {

	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("city");
		address.setDistrict("district");
		address.setNation("nation");
		address.setPin(123456);
		address.setState("state");
		address.setStreet("street");
		address.setVillage("village");
		List<ClassRoom> rooms = new ClassRoomDao ().getAllClassRooms();
		
		
		School school=new School();
		school.setAddress(address);
		school.setName("name");
		school.setClassRoom(rooms);
		
		SchoolDao dao=new SchoolDao();
		dao.saveSchool(school);
		
		List<ClassRoom> allRooms = new ClassRoomDao().getAllClassRooms();
		System.out.println(allRooms);

	}

}
