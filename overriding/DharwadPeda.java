package com.xworkz.overriding;

public class DharwadPeda extends Sweet {
	public String place = "Dharwad";

	public DharwadPeda() {
		super();
		System.out.println("invoke the no arg DharwadPeda ");
	}

	@Override
	public void selling() {
		System.out.println(super.price);
	}
	public void display() {
		System.out.println(super.price);
		System.out.println(super.name);
		System.out.println(super.place);
		System.out.println(this.place);
	}
}
