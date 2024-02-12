package com.jsp.dataTransfer.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="university_details")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String uloc;
	private int uemp;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Department> deptList;
	public int getUid() {
		return uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUloc() {
		return uloc;
	}
	public void setUloc(String uloc) {
		this.uloc = uloc;
	}
	public int getUemp() {
		return uemp;
	}
	public void setUemp(int uemp) {
		this.uemp = uemp;
	}
	public List<Department> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}
	

}
