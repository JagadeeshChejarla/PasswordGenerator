package com.example.dto;

public class AdminDTO {
	private String adminName;
	private String adminPassword;
	private String adminEmail;
	private String adminPhone;
	public AdminDTO() {
		
	}
	public AdminDTO(String adminName, String adminPassword, String adminEmail, String adminPhone) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	@Override
	public String toString() {
		return "AdminDTO [adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminEmail=" + adminEmail + ", adminPhone=" + adminPhone + "]";
	}
	

}
