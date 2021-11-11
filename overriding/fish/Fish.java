package com.xworkz.overriding.fish;

public class Fish {
	private String name;
	
	private float price;
	private String color;
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Fish)
			{
				Fish fish=(Fish)obj;
				String checkName=fish.getName();
				String checkColor=fish.getColor();
				if(this.color.equals(checkColor) && this.name.equals(checkName)) {
					System.out.println("matched");
					return true;
				}else {
					System.out.println("not matched");
					return false;
				}
			}else
			{
				System.out.println("the data type is not correct");
				return false;
			}
		}
		return false;
	}
 
}
