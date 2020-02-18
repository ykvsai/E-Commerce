package com.capgemini.ecommerce.dao;

import java.util.Map;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.util.EcomRepo;

public class CategoryDaoImpl implements CategoryDao{
	
	Map<String, Category> cmap = EcomRepo.getEcomCatRepo();

	@Override
	public boolean addCategory(Category cat) throws IdException {
		if(cmap.containsKey(cat.getCategoryId())) {
			throw new IdException("Category already exists");
		}
		cmap.put(cat.getCategoryId(),cat);
		return true;
	}	

}
