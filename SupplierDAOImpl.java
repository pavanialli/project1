package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.online.onlinebooksbackend.model.Category;
import com.niit.online.onlinebooksbackend.model.Supplier;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional 
	public boolean saveOrUpdate(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional 
	public List<Supplier> list() {
		/*String hql = "from Supplier";
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		org.hibernate.Query query = s.createQuery(hql);
		List<Supplier> all=query.list();
		System.out.println("supplier list in impl");
		tx.commit();
		return all;*/
		List<Supplier> all=sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();
		return all;
		
	}

	public Supplier get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
