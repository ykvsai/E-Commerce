package com.capgemini.ecommerce.dao;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.exception.IdException;

public interface CategoryDao {
	
	boolean addCategory (Category cat) throws IdException;
}
