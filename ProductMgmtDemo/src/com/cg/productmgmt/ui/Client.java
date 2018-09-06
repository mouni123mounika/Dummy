package com.cg.productmgmt.ui;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cg.productmgmt.bean.Product;
import com.cg.productmgmt.exception.ProductException;
import com.cg.productmgmt.service.ProductService;

public class Client {
	Scanner scan = new Scanner(System.in);
	ProductService productService=new ProductService();
	public static void main(String[] args) {
		Client c= new Client();
		String option=null;
		while(true) {
		System.out.println("========Display Menu=========");
		System.out.println();
		System.out.println("1) Update Product Price");
		System.out.println("2) Display Product Price");
		System.out.println("3) Exit");
		System.out.println();
		System.out.println("Enter your choice :");
		option=c.scan.nextLine();
		switch(option) {
		case "1":
			c.updateProducts();
			break;
		case "2":
			c.getProductdetails();
			break;
		case"3":
			System.exit(0);
			break;
		}
		}
	}
	public void updateProducts() {
		Product product = new Product();
		try {
		System.out.println("Enter the Product Category : ");
		product.setProductCategory(scan.nextLine());
		System.out.println("Enter hike Rate : ");
		int hike=Integer.parseInt(scan.nextLine());
		
		int ret=ProductService.updateProducts(product.getProductCategory(), hike);
		if(ret==1) {
			System.out.println("Successfully hiked the price");
		}
			
		}
		catch (ProductException e) {
			System.out.println();
			System.err.println("An error occured : " +e.getMessage());
			System.out.println();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void getProductdetails() {
		try {
			Map<String, Integer> productDetails=productService.getProductDetails();
			@SuppressWarnings("rawtypes")
			Set set=productDetails.entrySet();
			System.out.println();
			System.out.println("Following are the Product Details :");
			set.stream().forEach(System.out::println);
			System.out.println();
		} catch (ProductException e) {
			System.out.println();
			System.err.println("An error occured : " +e.getMessage());
			System.out.println();
		}
	}

}
