package com.example.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RetailerDAOImpl implements RetailerDAO {
    @PersistenceContext
    private EntityManager entityManager;

	@Override
	public void addRetailer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getRetailer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRetailer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRetailer() {
		// TODO Auto-generated method stub
		
	}

}
