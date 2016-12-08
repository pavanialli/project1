package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import com.niit.online.onlinebooksbackend.model.Supplier;



public interface SupplierDAO {

	//public boolean delete(Supplier supplier);
	public Supplier get(int id);
    public List<Supplier>list();
	public boolean saveOrUpdate(Supplier supplier);

}
