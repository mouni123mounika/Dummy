package com.cg.productmgmt.dao;

import java.util.Map;

import com.cg.productmgmt.exception.ProductException;

public interface IProductdao {
	public int updateProducts(String Category,int hike) throws ProductException;
	public Map<String,Integer>getProductDetails() throws ProductException;
	public Map<String, String> getDetails() throws ProductException;

}
