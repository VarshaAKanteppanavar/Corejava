package com.xworkz.overriding.shoe;

public class Shoes {
	private String brand;
	private int size;
	private String color;
	private char gender;

	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Shoes) {
				Shoes shoes=(Shoes)obj;
				String checkBrnd=shoes.getBrand();
				int checkSize=shoes.getSize();
				Integer cs=Integer.valueOf(checkSize);
				
				if(this.brand.equals(checkBrnd) && cs.equals(size)) {
					System.out.println("matched");
					return true;
				}
				else
				{
					System.err.println("not matched");
					return false;
				}
			}else {
			  System.err.println("not correct data type");
			  return false;
			}}
		
		return false;
	}
}


