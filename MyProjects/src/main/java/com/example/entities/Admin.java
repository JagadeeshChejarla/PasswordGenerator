package com.example.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AdminTable")
public class Admin implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
    @Column(name="admin_mail")
	private String adminMail;
    @Column(name="admin_mail")
	private String adminName;
    @Column(name="admin_name")
	private String adminPassword;
    @Column(name="admin_phone")
	private String adminPhone;
    @OneToMany(mappedBy="AdminTable", fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Retailer> retailer;
   
    
    public Admin() {}
    
	public String getAdminMail() {
		return adminMail;
	}
	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
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
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public List<Retailer> getRetailer() {
		return retailer;
	}
	public void setRetailer(List<Retailer> retailer) {
		this.retailer = retailer;
	}
    
    
    
}
