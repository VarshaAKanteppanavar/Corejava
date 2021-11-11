package com.xworkz.overriding.food;

public class Food {
	private String name;
	private float price;
	private int quantity;
	private String quality;
	
	public Food() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Food) {
				Food food=(Food)obj;
				String checkName=food.getName();
				String checkQuality=food.getQuality();
				if(this.name.equals(checkName)&& this.quality.equals(checkQuality)) {
					System.out.println("match");
					return true;
				}else {
					System.out.println("not matched");
					return false;
				}
			}else {
				return false;
			}
		
		}
		
	       return false;
}
}
