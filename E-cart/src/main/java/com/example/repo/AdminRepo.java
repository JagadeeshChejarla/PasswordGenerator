package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {
	public String addAdmin(Admin admin);
	

}
