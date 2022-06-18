package com.example.demo.Repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {
    @PersistenceContext
      private EntityManager entityManager;

	@Override
	@Transactional
	public Admin getAdmin(int id) {
		Admin ad = this.entityManager.find(Admin.class,id);
		return ad;
	}

	@Override
	public void updateAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	@Transactional
	public void addAdmin (Admin admin) {
		Admin a = new Admin();
		a.setAdminMail(admin.getAdminMail());
		a.setAdminName(admin.getAdminName());
		a.setAdminPassword(admin.getAdminPassword());
		a.setAdminPhone(admin.getAdminPhone());
		this.entityManager.persist(a);
		
	}

}
