package com.xworkz.overriding.headset;

public class HeadSet {
	private String brand;
	private Type type;
	private float battery;
	private float warranty;
	
	public HeadSet() {
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 127890;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public float getBattery() {
		return battery;
	}
	public void setBattery(float battery) {
		this.battery = battery;
	}
	public float getWarranty() {
		return warranty;
	}
	public void setWarranty(float warranty) {
		this.warranty = warranty;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof HeadSet) {
				HeadSet headset=(HeadSet)obj;
				String checkBrand=headset.getBrand();
				Type checkType=headset.getType();
				if(this.brand.equals(checkBrand) && this.type.equals(checkType)) {
					System.out.println("matched");
					return true;
				}else {
					System.out.println("not matched");
					return false;
				}
			}else
			{
				System.out.println("the data type is different");
				return false;
			}
		}
		return false;
	}
	

}
