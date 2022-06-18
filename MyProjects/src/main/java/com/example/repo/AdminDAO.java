package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Admin;

public interface AdminDAO {
	public void addAdmin(Admin admin);
	public Admin getAdmin(int id);
	public void updateAdmin();
	public void deleteAdmin();
}
