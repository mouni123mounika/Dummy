package com.cg.productmgmt.service;

import java.util.Map;

import com.cg.productmgmt.dao.Productdao;
import com.cg.productmgmt.exception.ProductException;

public class ProductService implements IProductService {
	
static Productdao productDao=new Productdao();
	
	private static boolean validateRate(int rate) throws ProductException {
		if((rate<=0)) {
			throw new ProductException("The Hike Rate should be greater than Zero");
		}
		return true;	
	}
	
	private static boolean validateCategory(String category) throws ProductException {
		if(productDao.getDetails().containsValue(category)) {
			return true;
		}
		throw new ProductException("Category not present");
		
	}

	public int updateProducts(String Category, int hike) throws ProductException {
		if(validateCategory(Category) && validateRate(hike)) {
			
		}
		return (productDao.updateProducts(Category, hike));
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		return productDao.getProductDetails();
	}

}
