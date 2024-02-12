package com.jsp.dataTransfer.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	
	private String bankName;

	private String AccNumber;
	public int getaId() {
		return aId;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(String accNumber) {
		AccNumber = accNumber;
	}
}
