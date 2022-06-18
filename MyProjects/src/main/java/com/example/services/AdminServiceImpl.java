package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Admin;
import com.example.repo.AdminDAO;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO ad;
	
	@Override
	public String addAdmin(Admin admin) {
		ad.addAdmin(admin);
		return "Added Successfully";
	}

	@Override
	public Admin getAdmin(int id) {
		return ad.getAdmin(id);
	}

}
