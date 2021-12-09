package com.xworkz.dp.dto;

public class BucketDTO {
	private String color;
	private char size;
	private float price;
	private float quantity;
	private String company;
	
	public BucketDTO() {
		
	}

	public BucketDTO(String color, char size, float price, float quantity, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
