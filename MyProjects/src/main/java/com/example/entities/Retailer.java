package com.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RetailersTable")
public class Retailer implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int retailerId;
	@Column
	private String retailerName;
	@Column
	private String retailerEmail;
	@Column
	private String retailerPhone;
	@Column
	private String retailerAddress;
	@ManyToOne
	@JoinColumn(name="admin_id")
	private Admin adminTable;
	
	public Retailer() {
		
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public String getRetailerEmail() {
		return retailerEmail;
	}
	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}
	public String getRetailerPhone() {
		return retailerPhone;
	}
	public void setRetailerPhone(String retailerPhone) {
		this.retailerPhone = retailerPhone;
	}
	public String getRetailerAddress() {
		return retailerAddress;
	}
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	public Admin getAdminTable() {
		return adminTable;
	}
	public void setAdminTable(Admin adminTable) {
		this.adminTable = adminTable;
	}
	

}
