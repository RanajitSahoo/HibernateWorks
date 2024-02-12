package com.jsp.ManytoOneUtility;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject_details")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subId;
	private String subName;
	private String subAuth;
	public int getSubId() {
		return subId;
	}
	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubAuth() {
		return subAuth;
	}
	public void setSubAuth(String subAuth) {
		this.subAuth = subAuth;
	}
}
