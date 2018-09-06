package com.cg.productmgmt.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.cg.productmgmt.exception.ProductException;

public class Productdao implements IProductdao {
	static Map<String,String>productDetails;
	static Map<String,Integer>salesDetails;
	
	static{
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "electronics");
		productDetails.put("samsung", "electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");
		
		salesDetails = new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 60);

}

	@Override
	public int updateProducts(String Category, int hike) throws ProductException {
		Set<String> products=new HashSet<String>();
		Set<String> keys=productDetails.keySet();
		
		String value=null;
		int nePrice=0;
		int updated=0;
		
		for(String key:keys) {
			value=productDetails.get(key);
			if(value.equals(Category)) {
				products.add(key);
			}
		}
		Set<String> keySales=productDetails.keySet();
		for(String sale:keySales) {
			if(products.contains(sale)) {
			nePrice=salesDetails.get(sale);
			nePrice+=hike;
			salesDetails.put(sale, nePrice);
			updated=1;
		}
		}
		return updated;
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return salesDetails;
	}

	@Override
	public Map<String, String> getDetails() throws ProductException {
		// TODO Auto-generated method stub
		return productDetails;
	}}
