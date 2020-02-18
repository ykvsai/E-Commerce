package com.capgemini.ecommerce.dao;

import java.util.Map;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.util.EcomRepo;

public class ProductDaoImpl implements ProductDao {
	
	Map<String, Product> pmap = EcomRepo.getEcomProdRepo();
	Map<String, Category>cmap = EcomRepo.getEcomCatRepo();
	Product pro = new Product();
	
	@Override
	public boolean addProduct(Product prod) throws IdException {
		if(pmap.containsKey(prod.getProductId())) {
			throw new IdException("Id already exists");
		}
		pmap.put(prod.getProductId(),prod);
		return true;
	}

	@Override
	public Category getCategory(String catId) throws IdException {
		if(!cmap.containsKey(catId))
			throw new IdException("Id doesn't exist");
		return cmap.get(catId);
	}

	@Override
	public boolean addProductSpec(Product prod) throws IdException {
		return pmap.put(prod.getProductId(),prod) != null;
	}

	@Override
	public Product getProduct(String prodId) throws IdException {
		if(!pmap.containsKey(prodId))
			throw new IdException("No Product exists with id: "+ prodId);
		return pmap.get(prodId);
	}
	
}
