package com.capgemini.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.ecommerce.entity.ProductSpecification;
import com.capgemini.ecommerce.exception.IdException;
import com.capgemini.ecommerce.exception.ValidateException;
import com.capgemini.ecommerce.service.EcomSerImpl;
import com.capgemini.ecommerce.service.EcommerceService;

public class AddProdSpecTest {
	
	static EcommerceService ser= new EcomSerImpl();

	@Test
	public void testAddProdSpec1() throws IdException, ValidateException {
		assertTrue(ser.addProductSpec("1001", new ProductSpecification("FingerPrint","Yes")));
	}
	
	@Test
	public void testAddProdSpec2() throws IdException, ValidateException {
		assertThrows(IdException.class,()->ser.addProductSpec("1011", new ProductSpecification("KeyPad","No")));
	}
	
	@Test
	public void testAddProdSpec3() throws IdException, ValidateException {
		assertThrows(ValidateException.class,()->ser.addProductSpec("1002", new ProductSpecification("Sim Slots","2")));
	}
	
	@Test
	public void testAddProdSpec4() throws IdException, ValidateException {
		assertThrows(ValidateException.class,()->ser.addProductSpec("1001", new ProductSpecification("","")));
	}

}
