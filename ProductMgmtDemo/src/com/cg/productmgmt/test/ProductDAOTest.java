package com.cg.productmgmt.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.cg.productmgmt.dao.Productdao;
import com.cg.productmgmt.exception.ProductException;

class ProductDAOTest {

Productdao productDao=new Productdao();
	
	@Test
	public void testUpdateProductDetails() {
		try {
			int prod=productDao.updateProducts("electronics", 10);
			assertEquals(1,prod);
			
		}catch(ProductException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetProductDetails() {
		try {
			Map<String, Integer> prod=productDao.getProductDetails();
			assertEquals(7,prod.size());
			
		}catch(ProductException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetDetails() {
		try {
			Map<String, Integer> prod=productDao.getProductDetails();
			assertEquals(7,prod.size());
			
		}catch(ProductException e) {
			e.printStackTrace();
		}
	}

}
