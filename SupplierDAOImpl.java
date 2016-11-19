package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.online.onlinebooksbackend.model.Supplier;

@Repository(value = "supplierDAO")
 @EnableTransactionManagement

public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	/*public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}*/

	public Supplier get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	 /* public List<Supplier> list() { 
		 // TODO Auto-generated method stub return
	   return null; }*/
	 

	@Transactional // ACID either update evrgthg or not
	public boolean saveOrUpdate(Supplier supplier) {
		try {
			/*
			 * Session s=sessionFactory.getCurrentSession(); Transaction
			 * t=s.beginTransaction(); s.saveOrUpdate(user); t.commit();//either
			 * comit or rollback transaction incomplete return true;
			 */
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}
}
