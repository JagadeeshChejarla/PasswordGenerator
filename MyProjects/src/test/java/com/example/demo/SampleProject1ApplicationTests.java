package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entities.Admin;
import com.example.repo.AdminDAO;

@SpringBootTest
class SampleProject1ApplicationTests {
	@Autowired
	AdminDAO ad;

	@Test
	void contextLoads() {
	}
	@Test
	void myTest() {
  Admin a = new Admin();
  a.setAdminMail("chejarlajagadeesh@gmail.com");
  a.setAdminName("Jaggu");
  a.setAdminPassword("Jaggu@2615");
  a.setAdminPhone("9948774103");
  ad.addAdmin(a);
	}

}
