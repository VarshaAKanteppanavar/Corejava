package com.xworkz.overriding.bag;

public class BagRunner {

	public static void main(String[] args) {
		Bag bag=new Bag();
		Bag bag1=new Bag();
		Bag bag2=new Bag();
		bag.setPrice(280.0f);
		bag1.setNoOfSection(0);
		bag.setPrice(280.7f);
		bag.setNoOfSection(4);
		System.out.println(bag2.toString());
		System.out.println(bag2.hashCode());
		System.out.println(bag.equals(bag1));

	}

}
