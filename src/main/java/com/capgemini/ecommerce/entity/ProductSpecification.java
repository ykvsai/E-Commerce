package com.capgemini.ecommerce.entity;

public class ProductSpecification {
	
	private String specName;
	private String specValue;
	
	public ProductSpecification() {
		super();
	}

	public ProductSpecification(String specName, String specValue) {
		super();
		this.specName = specName;
		this.specValue = specValue;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecValue() {
		return specValue;
	}

	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

}
