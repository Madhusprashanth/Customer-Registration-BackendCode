package com.example.Validation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {
	
	
	Address address;
	private String userName;
	private int Phnumber;
	private String Gender;
	private String accountType;
	private int AccountNumber;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPhnumber() {
		return Phnumber;
	}
	public void setPhnumber(int phnumber) {
		Phnumber = phnumber;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	 public Customer() {}

	 public Customer(Address address, String userName, int Phnumber, String gender, String accountType,
			int accountNumber) {
		this.address = address;
		this.userName = userName;
		this.Phnumber = Phnumber;
		Gender = gender;
		this.accountType = accountType;
		AccountNumber = accountNumber;
	}
	
	
	
}	