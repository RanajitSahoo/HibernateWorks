package com.jsp.HibernatePackage1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="emp_details")//if you give that annotation it will not affect the database, so first we need to delete that Employee table then 
//execute that program it will create a new table in the database and @column annotation also change the column name.
//@Table(name="emp_details")
public class Employee {
	@Id//it is used to create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="ename")
	private String name;
	@Column(name="esal",insertable = true)
	private int sal;
	@Column(name="eAddress",unique = true )
	private String address;
	
	public Employee() {
		super();
	}
	
	
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	
}
