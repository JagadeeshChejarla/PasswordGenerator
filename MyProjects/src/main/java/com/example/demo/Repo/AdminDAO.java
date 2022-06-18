package com.example.demo.Repo;
import com.example.demo.Entities.Admin;

public interface AdminDAO {
	public void addAdmin(Admin admin);
	public Admin getAdmin(int id);
	public void updateAdmin();
	public void deleteAdmin();
}
