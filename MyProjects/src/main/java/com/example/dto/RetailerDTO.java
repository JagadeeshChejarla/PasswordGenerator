package com.example.dto;

public class RetailerDTO {
	private String rName;
	private String rEmail;
	private String rMobile;
	private String rAddress;
	private String rPassword;
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrEmail() {
		return rEmail;
	}
	public void setrEmail(String rEmail) {
		this.rEmail = rEmail;
	}
	public String getrMobile() {
		return rMobile;
	}
	public void setrMobile(String rMobile) {
		this.rMobile = rMobile;
	}
	public String getrAddress() {
		return rAddress;
	}
	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}
	public String getrPassword() {
		return rPassword;
	}
	public void setrPassword(String rPassword) {
		this.rPassword = rPassword;
	}
	public RetailerDTO(String rName, String rEmail, String rMobile, String rAddress, String rPassword) {
		super();
		this.rName = rName;
		this.rEmail = rEmail;
		this.rMobile = rMobile;
		this.rAddress = rAddress;
		this.rPassword = rPassword;
	}
	

}
