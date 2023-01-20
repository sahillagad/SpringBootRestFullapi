package com.Masai.Bean;

public class Product {

	
	private Integer productId;
	private String productName;
	private Double productPrice;
    private String Address;
	public Product(Integer productId, String productName, Double productPrice, String address) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		Address = address;
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", Address=" + Address + "]";
	}
    
    


}
