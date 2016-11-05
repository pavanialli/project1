package com.niit.online.onlinebooksbackend.dao;

import java.util.List;



public interface CategoryDAO {
	
	public boolean saverOrUpdate();
	public boolean delete(CategoryDAOImpl category);
	public CategoryDAO get(int id);
	public List<CategoryDAO>list();

}
