package com.capgemini.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;

import com.capgemini.ecommerce.entity.Category;
import com.capgemini.ecommerce.entity.Product;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.exception.ValidateException;
import com.capgemini.ecommerce.service.EcomSerImpl;
import com.capgemini.ecommerce.util.EcomRepo;

public class EcomTest {
	
	static EcomSerImpl ser= new EcomSerImpl();
	Map<String, Category> cmap = EcomRepo.getEcomCatRepo();
	Map<String, Product> pmap = EcomRepo.getEcomProdRepo();
	
	@Test
	public void testAddCategory1() throws IdException, ValidateException {
		assertTrue(ser.addCategory(new Category("105","TopWear")));
	}
	
	@Test
	public void testAddCategory2() throws IdException, ValidateException {
		assertThrows(ValidateException.class,()->ser.addCategory(new Category("BottomWear","107")));
	}

}
