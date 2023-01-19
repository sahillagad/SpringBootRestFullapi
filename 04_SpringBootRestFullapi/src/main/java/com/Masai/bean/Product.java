package com.Masai.bean;

public class Product {


	Integer productId;
	String name;
	Integer productPrice;
	public Product(Integer productId, String name, Integer productPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", productPrice=" + productPrice + "]";
	}
	


}
