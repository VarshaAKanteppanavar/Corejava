package com.xworkz.overriding.shoe;

public class ShoesRunner {

	public static void main(String[] args) {
		Shoes shoes=new Shoes();
		Shoes shoes1=new Shoes();
		shoes.setBrand("nike");
		shoes1.setBrand("nike");
		shoes.setSize(6);
		shoes1.setSize(4);
	    
		System.out.println(shoes.equals(shoes1));
		System.out.println(shoes.hashCode());
		System.out.println(shoes.toString());

	}

}
