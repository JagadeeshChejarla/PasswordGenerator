package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AdminDTO;
import com.example.entities.Admin;
import com.example.repo.AdminRepo;

@Service
public class AdminService {
	private AdminRepo adminrepo;
    @Transactional
	public String addAdmin(AdminDTO admin) {
		Admin ad = new Admin();
		ad.setAdminEmail(admin.getAdminEmail());
		ad.setAdminPhone(admin.getAdminPhone());
		ad.setPassword(admin.getAdminPassword());
		adminrepo.save(ad);
		return "Successfully added";
	}

}

