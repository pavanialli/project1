package com.niit.online.onlinebooksbackend.dao;

import java.util.List;

import com.niit.online.onlinebooksbackend.model.Product;



public interface ProductDAO {
	
	public boolean saverOrUpdate();
	public boolean delete(Product product);
	public Product get(int id);
	public List<Product>list();
}
