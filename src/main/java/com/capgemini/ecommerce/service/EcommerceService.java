package com.capgemini.ecommerce.service;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.entity.ProductSpecification;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.exception.ValidateException;

public interface EcommerceService {
	
	boolean addProduct (Product prod, String catID) throws IdException, ValidateException;
	boolean addCategory (Category cat) throws IdException, ValidateException;
	boolean addProductSpec(String prodId, ProductSpecification prodSpec) throws IdException, ValidateException;

}
