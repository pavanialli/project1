package com.niit.online.onlinebooksbackend.dao;

import com.niit.online.onlinebooksbackend.model.User;

public interface UserDAO {
 public boolean isValidate(String userid,String passwd);
 public boolean saveOrUpdate(User user);//details about user 
 
}
