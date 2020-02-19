package com.capgemini.ecommerce.service;

import java.util.List;
import com.capgemini.ecommerce.dao.*;
import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.entity.ProductSpecification;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.exception.ValidateException;

public class EcomSerImpl implements EcommerceService {

	ProductDao prodDao = new ProductDaoImpl();
	CategoryDao cats = new CategoryDaoImpl();

	@Override
	public boolean addProduct(Product prod, String catID) throws IdException, ValidateException {
		if(!validateProduct(prod)) {
			Category category = prodDao.getCategory(catID);
			prod.setProductCategory(category);
			return prodDao.addProduct(prod);
		}else {
			return false;
		}
	}

	@Override
	public boolean addCategory(Category cat) throws IdException, ValidateException {
		if(!validateCategory(cat)) 
			return cats.addCategory(cat);
		else
			return false;
	}

	@Override
	public boolean addProductSpec(String prodId, ProductSpecification prodSpec)
			throws IdException, ValidateException {
		if(!validateProSpec(prodSpec)) {
			Product product = prodDao.getProduct(prodId);
			List<ProductSpecification> productSpec = product.getProdSpec();
			productSpec.add(prodSpec);
			product.setProdSpec(productSpec);
			return prodDao.addProductSpec(product);
		}
		return true;
	}
	
	public boolean validateProduct(Product prod)throws ValidateException{
		if(!prod.getProductId().matches("[0-9]{4}+"))
			throw new ValidateException("Only Numbers are accepted & size must be 4 characters");
		if(!prod.getProductName().matches("[A-Za-z]{3,15}+"))
			throw new ValidateException("Only alphabets are acception & size must between 3 to 15 characters");
		if(!prod.getBrandName().matches("[A-Za-z0-9]{3,15}+"))
			throw new ValidateException("Only alphabets are acception & size must between 3 to 15 characters");
		if(prod.getPrice()<=0)
			throw new ValidateException("Price should be more than Zero");
		if(prod.getStock()<0)
			throw new ValidateException("Stock must not be lesser than Zero");
		return false;
	}
	
	public boolean validateCategory(Category cat)throws ValidateException{
		if(!cat.getCategoryId().matches("[0-9]{3}+"))
			throw new ValidateException("Only Numbers are accepted & size should be 4 characters");
		if(!cat.getCategoryName().matches("[A-Za-z]{3,15}+"))
			throw new ValidateException("Only alphabets are acception & size must between 3 to 15 characters");
		return false;
	}
	
	public boolean validateProSpec(ProductSpecification proSpec) throws ValidateException{
		if(!proSpec.getSpecName().matches("[A-Za-z]{2,15}+"))
			throw new ValidateException("Only alphabets are acception & size must between 2 to 10 characters");
		if(!(proSpec.getSpecValue().length()>1 && proSpec.getSpecValue().length()<=20 ))
			throw new ValidateException("size must between 2 to 20 characters");
		return false;
	}

}
