package com.casaone.demo;

import java.util.Date;

public class Product {
	
	int id;
	String name;
	int color;
	String finish;
	float purchase_price;
	float Time_to_assembl_product; // variable
	float cost_of_assembly;
	boolean isRented;
	Date startDate;
	Date endDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public float getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(float purchase_price) {
		this.purchase_price = purchase_price;
	}
	public float getTime_to_assembl_product() {
		return Time_to_assembl_product;
	}
	public void setTime_to_assembl_product(float time_to_assembl_product) {
		Time_to_assembl_product = time_to_assembl_product;
	}
	public float getCost_of_assembly() {
		return cost_of_assembly;
	}
	public void setCost_of_assembly(float cost_of_assembly) {
		this.cost_of_assembly = cost_of_assembly;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	
	
	
}
