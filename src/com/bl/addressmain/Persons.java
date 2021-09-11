package com.bl.addressmain;

import java.util.Scanner;

public class Persons {
	protected String FirstName;
	private String LastName;
	private String Address;
	private String State;
	private String City;
	private String ZipCode;
	private String PhoneNo;
	private String Email;
	
	public Persons(String firstName, String lastName, String address, String state, String city, String zipCode2,String phoneNo2, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		State = state;
		City = city;
		ZipCode = zipCode2;
		PhoneNo = phoneNo2;
		Email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Persons [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", State="
				+ State + ", City=" + City + ", ZipCode=" + ZipCode + ", PhoneNo=" + PhoneNo + ", Email=" + Email + "]";
	}

}
