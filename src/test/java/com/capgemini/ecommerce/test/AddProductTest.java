package com.capgemini.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.exception.ValidateException;
import com.capgemini.ecommerce.service.EcomSerImpl;
import com.capgemini.ecommerce.util.EcomRepo;

public class AddProductTest {
	
	static EcomSerImpl ser=new EcomSerImpl();;
	Map<String, Category> cmap = EcomRepo.getEcomCatRepo();  
	
	@Test
	public void testAddProduct1() throws IdException, ValidateException {
		assertTrue(ser.addProduct(new Product("1006",cmap.get("101") , "Poco", "XTwo", 16000, EcomRepo.pslst1, 5000), "101"));
	}
	
	@Test
	public void testAddProduct2() throws IdException, ValidateException {
		assertThrows(ValidateException.class,()->ser.addProduct(new Product("",cmap.get("") , "", "",0 , null, 0), ""));
	}
	
	@Test
	public void testAddProduct3() throws IdException, ValidateException {
		assertThrows(IdException.class,()->ser.addProduct(new Product("1006",cmap.get("103") , "wrogn", "Jeans", 1100, null, 10), "103"));
	}
	
	@Test
	public void testAddProduct4() throws IdException, ValidateException {
		assertThrows(ValidateException.class,()->ser.addProduct(new Product("10050",cmap.get("102") , "Asus", "Rog", 56000, null, 1000), "102"));
	}
	
	@Test
	public void testAddProduct5() throws IdException, ValidateException {
		assertThrows(IdException.class,()->ser.addProduct(new Product("1008",cmap.get("103") , "Asus", "Rog", 56000, null, 1000), ""));
	}

}
