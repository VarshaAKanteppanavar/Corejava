package com.xworkz.overriding.Tyre;

import com.xworkz.overriding.aeroplane.Aeroplane;

public class Tyre {
	private String brand;
	private String type;
	private String price;
	public Tyre() {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Tyre) {
				Tyre aer=(Tyre)obj;
				String checkBrand=aer.getBrand();
			    String checkType=aer.getType();
				//Integer cn=Integer.valueOf(checkNo);
				
				if(this.brand.equals(checkBrand) && this.type.equals(checkType))
				{
					System.out.println("matched");
					return true;
				}else {
					System.out.println("not matched");
					return false; 
				}
				
			}else {
				System.out.println("enete correct type");
				return false;
			}
		}
		return false;
	}


	}


