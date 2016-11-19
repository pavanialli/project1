package com.niit.online.onlinebooksbackend.dao;

import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.online.onlinebooksbackend.model.User;

@Repository(value = "userDAO")
//@EnableTransactionManagement

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean isValidate(String userid, String passwd) {
		// TODO Auto-generated method stub
		
	
		 if(userid.equals("pa")&&passwd.equals("pa"))
		{
			//b=true;
		 return true;
		}
		else
		{
		   return false;
		}
	}
	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional//ACID either update evrgthg or not 
	public boolean saveOrUpdate(User user) {
		try {
		/*Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(user);
		t.commit();//either comit or rollback transaction incomplete
		return true;
*/			
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}
	
}
