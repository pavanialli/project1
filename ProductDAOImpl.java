package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.online.onlinebooksbackend.model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	public ProductDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	public boolean saverOrUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
