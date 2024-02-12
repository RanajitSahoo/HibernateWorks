package com.jsp.controller.Student;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.ClassRoomDao;
import com.jsp.dao.PrincipalDao;
import com.jsp.dao.SchoolDao;
import com.jsp.dao.SubjectDao;
import com.jsp.dao.TeacherDao;
import com.jsp.dto.ClassRoom;
import com.jsp.dto.Principal;
import com.jsp.dto.School;
import com.jsp.dto.Student;
import com.jsp.dto.Subject;
import com.jsp.dto.Teacher;
import com.jsp.util.Address;

public class SaveStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Ranajit Sahoo");
		s1.setAge(26);
		s1.setMark(99);
		Address ad=new Address();
		ad.setCity("Bangalore");
		ad.setDistrict("Bangalore");
		ad.setNation("India");
		ad.setPin(560049);
		ad.setState("Karnataka");
		ad.setStreet("KLM Road");
		ad.setVillage("Marathalli");
		s1.setAddress(ad);
		ClassRoomDao cr=new ClassRoomDao();
		ClassRoom classr=cr.getClassRoomById("9th");
		s1.setClassRoom(classr);
		PrincipalDao pd=new PrincipalDao();
		Principal principal=pd.getPrincipalById("raveesh");
		s1.setPrincipal(principal);
		SubjectDao subd=new SubjectDao();
		List<Subject> subjects= subd.getAllSubject();
		List<Subject> subs= new ArrayList<Subject>();
		for(Subject subject:subjects) {
			if(subject.getName().equals("java")||subject.getName().equals("web")) {
				subs.add(subject);
			}
		}
		s1.setSubjects(subs);
		TeacherDao td=new TeacherDao();
		List<Teacher> tes= td.getAllTeachers();
		List<Teacher> teachers=new ArrayList<Teacher>();
		for(Teacher t:tes) {
			if(t.getSubject().getName().equals("java")|| t.getSubject().getName().equals("web")) {
				teachers.add(t);
			}
		}
		s1.setTeachers(teachers);
		SchoolDao sd=new SchoolDao();
		School school=sd.getSchoolById("jspider");
		s1.setSchool(school);

	}

}
