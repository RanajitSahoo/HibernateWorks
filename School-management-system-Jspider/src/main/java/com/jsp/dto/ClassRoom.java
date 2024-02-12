package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="class_room_info")
public class ClassRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int class_id;
	private String name;
	private int seat_Capacity;
	@OneToMany(cascade = CascadeType.MERGE)
	private List<Teacher> teacher;
	private List<Student> student;
	@Override
	public String toString() {
		return "ClassRoom [class_id=" + class_id + ", name=" + name + ", seat_Capacity=" + seat_Capacity + "]";
	}
	public ClassRoom() {
	
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeat_Capacity() {
		return seat_Capacity;
	}
	public void setSeat_Capacity(int seat_Capacity) {
		this.seat_Capacity = seat_Capacity;
	}
	
	
}
