package com.example.dto;

public class AdminDTO {
	private String aName;
	private String aEmail;
	private String aNumber;
	private String password;
	
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaNumber() {
		return aNumber;
	}
	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminDTO(String aName, String aEmail, String aNumber, String password) {
		super();
		this.aName = aName;
		this.aEmail = aEmail;
		this.aNumber = aNumber;
		this.password = password;
	}
	

}
