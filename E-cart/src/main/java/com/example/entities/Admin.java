package com.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Admin implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	@NotNull (message="user name should not be null")
	private int adminId;
	@Column(name="admin_name")
	@NotNull(message="Name must be entered")
	private String adminName;
	@Column(name="admin_email")
	@Email (message="Enter valid email")
	private String adminEmail;
	@Column(name="admin_password")
	@NotNull
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$” ", message="invalid password")
	private String password;
	@Column(name="admin_phone")
	@NotNull
	@Pattern(regexp="^\\d{10}$")
	private String adminPhone;
	public Admin() {
		
	}
	
	public Admin(int adminId, String adminEmail, String password, String adminPhone) {
		super();
		this.adminId = adminId;
		this.adminEmail = adminEmail;
		this.password = password;
		this.adminPhone = adminPhone;
	}

	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", password=" + password + ", adminPhone="
				+ adminPhone + "]";
	}
	
	  

}
