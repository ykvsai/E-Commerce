package com.capgemini.ecommerce.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.ecommerce.entity.*;

public class EcomRepo {
	
	private static Map<String, Product> pmap = new HashMap<>();
	private static Map<String, Category> cmap = new HashMap<>();
	
	public static List<ProductSpecification> pslst1 = new ArrayList<>();
	public static List<ProductSpecification> pslst2 = new ArrayList<>();
	public static List<ProductSpecification> pslst3 = new ArrayList<>();
	public static List<ProductSpecification> pslst4 = new ArrayList<>();
	
	/**
	 * @author Yakkala Kesava Venkata Sai
	 * Description: In static method
	 * 				Creating Categories and putting into cmap(category map),
	 * 				Creating Product Specifications and adding to different lists with respect to product
	 * 				Creating Products and adding to pmap(product map)
	 * 				
	 */
	
	static {
		
		Category cat1 = new Category("101", "mobiles");
		Category cat2 = new Category("102", "Laptops");
		
		cmap.put("102", cat1);
		cmap.put("101", cat2);
		
		
		ProductSpecification ps1 = new ProductSpecification("Ram", "16gb");
		ProductSpecification ps2 = new ProductSpecification("Rom", "256gb");
		ProductSpecification ps3 = new ProductSpecification("camera", "108MP + 32MP + 12MP + 2MP");
		ProductSpecification ps4 = new ProductSpecification("color", "GoldenYellow");
		ProductSpecification ps5 = new ProductSpecification("size", "6.8 Inch");
		ProductSpecification ps6 = new ProductSpecification("display", "sAmoled");
		ProductSpecification ps7 = new ProductSpecification("battery", "6000mAh");
		ProductSpecification ps8 = new ProductSpecification("resolution", "2K");
		
		ProductSpecification ps9 = new ProductSpecification("Ram", "4gb");
		ProductSpecification ps10 = new ProductSpecification("Rom", "64gb");
		ProductSpecification ps11 = new ProductSpecification("camera", "32MP + 8MP + 2MP");
		ProductSpecification ps12 = new ProductSpecification("color", "Blue");
		ProductSpecification ps13 = new ProductSpecification("size", "5.9 Inch");
		ProductSpecification ps14 = new ProductSpecification("display", "Amoled");
		ProductSpecification ps15 = new ProductSpecification("battery", "5000mAh");
		ProductSpecification ps16 = new ProductSpecification("resolution", "1080p");
		
		ProductSpecification ps17 = new ProductSpecification("color", "silver");
		ProductSpecification ps18 = new ProductSpecification("Graphics", "Radeon 4GB");
		ProductSpecification ps19 = new ProductSpecification("ram", "16gb");
		ProductSpecification ps20 = new ProductSpecification("rom", "1TB");
		ProductSpecification ps21 = new ProductSpecification("size", "15.6 Inch");
		ProductSpecification ps22 = new ProductSpecification("resolution", "1080p");
		
		ProductSpecification ps23 = new ProductSpecification("color", "silver");
		ProductSpecification ps24 = new ProductSpecification("Graphics", "Radeon 4GB");
		ProductSpecification ps25 = new ProductSpecification("ram", "16gb");
		ProductSpecification ps26 = new ProductSpecification("rom", "1TB");
		ProductSpecification ps27 = new ProductSpecification("size", "15.6 Inch");
		ProductSpecification ps28 = new ProductSpecification("resolution", "1080p");
	
		pslst1.add(ps1);
		pslst1.add(ps2);
		pslst1.add(ps3);
		pslst1.add(ps4);
		pslst1.add(ps5);
		pslst1.add(ps6);
		pslst1.add(ps7);
		pslst1.add(ps8);
		
		pslst2.add(ps9);
		pslst2.add(ps10);
		pslst2.add(ps11);
		pslst2.add(ps12);
		pslst2.add(ps13);
		pslst2.add(ps14);
		pslst2.add(ps15);
		pslst2.add(ps16);
		
		pslst3.add(ps17);
		pslst3.add(ps18);
		pslst3.add(ps19);
		pslst3.add(ps20);
		pslst3.add(ps21);
		pslst3.add(ps22);
		
		pslst4.add(ps23);
		pslst4.add(ps24);
		pslst4.add(ps25);
		pslst4.add(ps26);
		pslst4.add(ps27);
		pslst4.add(ps28);
		
		Product pro1 = new Product("1001",cat1, "OnePlus", "7T McLearn", 65000, pslst1, 5);
		pmap.put("1001", pro1);
		
		Product pro2 = new Product("1002",cat1, "Samsung", "Galaxy M30", 15000, pslst2, 20);
		pmap.put("1002", pro2);
		
		Product pro3 = new Product("1003",cat2, "Dell", "Inspirion 5559", 75000, pslst3, 3);
		pmap.put("1003", pro3);
		
		Product pro4 = new Product("1004",cat2, "Dell", "Inspirion 5559", 75000, pslst4, 3);
		pmap.put("1004", pro4);
		
	}
	
	public static Map<String, Product> getEcomProdRepo(){
		return pmap;
	}
	
	public static Map<String,Category> getEcomCatRepo(){
		return cmap;
	}
}
