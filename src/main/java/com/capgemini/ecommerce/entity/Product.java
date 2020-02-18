package com.capgemini.ecommerce.entity;

import java.util.List;

public class Product {
	
	private String productId;
	private String productName;
	private List<ProductSpecification> prodSpec;
	private String brandName;
	private double price;
	private Category productCategory;
	private int stock;
	
	public Product() {
		super();
	}

	public Product(String productId, Category productCategory, String brandName, String productName, double price, List<ProductSpecification> prodSpec, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prodSpec = prodSpec;
		this.brandName = brandName;
		this.price = price;
		this.productCategory = productCategory;
		this.stock = stock;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public List<ProductSpecification> getProdSpec() {
		return prodSpec;
	}

	public void setProdSpec(List<ProductSpecification> prodSpec) {
		this.prodSpec = prodSpec;
	}

	@Override
	public String toString() {
		return "productId=" + this.productId + ", productName=" + this.productName + ", prodSpec=" + this.prodSpec
				+ ", brandName=" + this.brandName + ", price=" + this.price + ", productCategory=" + this.productCategory + ", stock="
				+ this.stock ;
	}
	
}
