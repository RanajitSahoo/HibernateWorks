package com.jsp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainers() {
		return trainers;
	}
	public void setTrainers(String trainers) {
		this.trainers = trainers;
	}
	public List<Student> getListStud() {
		return listStud;
	}
	public void setListStud(List<Student> listStud) {
		this.listStud = listStud;
	}
	private String name;
	private String trainers;
	@ManyToMany(mappedBy = "listSub")
	private List<Student> listStud;
}
