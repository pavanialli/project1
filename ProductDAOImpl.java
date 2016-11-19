package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.online.onlinebooksbackend.model.Product;

@Repository(value = "productDAO")
@EnableTransactionManagement

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionfactory;

	public ProductDAOImpl(SessionFactory sessionfactory) {
		// super();
		this.sessionfactory = sessionfactory;
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	public List<Product> list() {
    	Session s = sessionfactory.getCurrentSession();
    	Transaction tx = s.beginTransaction();
    	List<Product> list =s.createCriteria(Product.class).list();
		return list;
	}

	@Transactional
	public boolean saverOrUpdate(Product product) {
		try {
			/*Session s = sessionfactory.getCurrentSession();
			Transaction t = s.beginTransaction();
			s.saveOrUpdate(product);
			t.commit();// either comit or rollback transaction incomplete
			return true;*/
			sessionfactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
