package com.cg.productmgmt.bean;

public class Product {
	private String productName;
	private int hikeRate;
	private double productPrice;
	private String productCategory;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getHikeRate() {
		return hikeRate;
	}
	public void setHikeRate(int hikeRate) {
		this.hikeRate = hikeRate;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", hikeRate=" + hikeRate + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + "]";
	}
	

}
