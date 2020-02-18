package com.capgemini.ecommerce.dao;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.exception.IdException;

public interface ProductDao {
	
	boolean addProduct (Product prod) throws IdException;
	public Category getCategory(String catId)throws IdException;
	public boolean addProductSpec(Product spec) throws IdException;
	public Product getProduct(String prodId) throws IdException;

}
