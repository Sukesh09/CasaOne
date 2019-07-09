package com.casaone.demo;

import java.util.ArrayList;
import java.util.Date;

public class NotifierActivitiesImpl implements NotifierActivities{

	@Override
	public ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		
		User user = new User();
		user.setUserId(007);
		user.setUsername("Sukesh");
		user.setEmail("sukesh.iist@gmail.com");
		user.setProducts(getProducts());
		
		users.add(user);
		return users;
	}

	@Override
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		Date startDate = new Date(2019, 06, 01);
		Date endDate = new Date(2019, 07, 15);
		
		Product product = new Product();
		product.setId(001);
		product.setName("Washing-Machine");
		product.setColor(000000);
		product.setFinish("new");
		product.setRented(true);
		product.setStartDate(startDate);
		product.setEndDate(endDate);
		product.setCost_of_assembly(1000);
		product.setPurchase_price(22000);
		
		products.add(product);
		return products;
	}
	
}
