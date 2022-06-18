package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Admin;
import com.example.services.AdminService;

@RestController
public class MyController {
	@Autowired
	AdminService as;
	@RequestMapping(value="/adminregistration", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String addAdmin(Admin admin) {
		return as.addAdmin(admin);
	}
	

}
