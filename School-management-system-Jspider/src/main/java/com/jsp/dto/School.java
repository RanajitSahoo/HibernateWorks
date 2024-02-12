package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.util.Address;

@Entity
@Table(name = "School_Info")
public class School {
	@Id
	@GenericGenerator(name = "i", strategy = "com.jsp.util.SchoolId")
	@GeneratedValue(generator = "i")
	@Column(name = "school_Id")
	private String schoolId;
	@Column(name = "school_Name", insertable = true)
	private String name;
	private Address address;
	@OneToMany(cascade = CascadeType.MERGE)
	private List<ClassRoom> classRoom;
	@OneToOne(cascade = CascadeType.MERGE)
	private Principal principal;
	@OneToMany(cascade = CascadeType.MERGE)
	private List<Teacher> teacher;

	public String getSchoolId() {
		return schoolId;
	}

	public List<ClassRoom> getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(List<ClassRoom> classRoom) {
		this.classRoom = classRoom;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public School() {
		
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", address=" + address + "]";
	}

}
