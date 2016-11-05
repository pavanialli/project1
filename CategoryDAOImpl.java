package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	SessionFactory sessionfactory;
	
	public CategoryDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}
		
		

	public boolean saverOrUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(CategoryDAOImpl category) {
		// TODO Auto-generated method stub
		return false;
	}

	public CategoryDAO get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CategoryDAO> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
