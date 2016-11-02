package com.niit.online.onlinebooksbackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
}
