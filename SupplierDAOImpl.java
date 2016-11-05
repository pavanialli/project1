package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierDAOImpl implements SupplierDAO {
	
	
	
	@Autowired
	SessionFactory sessionfactory;
	
	public SupplierDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}
		

	public boolean saverOrUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(CategoryDAOImpl supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public SupplierDAO get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SupplierDAO> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
