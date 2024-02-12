package com.jsp.dataTransfer.oneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;




@Entity
@Table(name = "persons_details")
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	private String name;
	
	private int age;
	
	private String loc;
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@OneToMany(cascade = CascadeType.ALL)//it will add all account
	
	private List<Account> list;
	public int getPid() {
		return pid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Account> getList() {
		return list;
	}
	public void setList(List<Account> list) {
		this.list = list;
	}
}
