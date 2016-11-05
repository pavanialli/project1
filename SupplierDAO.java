package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

public interface SupplierDAO {
	
	public boolean saverOrUpdate();
	public boolean delete(CategoryDAOImpl supplier);
	public SupplierDAO get(int id);
	public List<SupplierDAO>list();

}
