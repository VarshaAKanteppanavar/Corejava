package com.xworkz.overriding;

public class Sweet {
	public String name;
	public String place;
	public float price;

	public Sweet() {
		super();
		System.out.println("invoke Sweet no arg constructor");
	}

	public Sweet(String name, String place, float price) {
		super();
		this.name = name;
		this.place = place;
		this.price = price;
	}

	public void making() {
		System.out.println("there are 20000 box of sweet made per day.");

	}

	public void selling() {
		System.out.println(this.price);
	}
	public void sweetdisplay()
	{
		System.out.println(this.price);
		System.out.println(this.name);
		System.out.println(this.place);
		
	}

}
