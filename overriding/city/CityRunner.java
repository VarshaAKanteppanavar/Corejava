package com.xworkz.overriding.city;

public class CityRunner {

	public static void main(String[] args) {
		City city=new City();
		City city1=new City();
		city.setName("Dharwad");
		city1.setName("Dharwad");
		city.setCountry("India");
		city1.setCountry("India");
		System.out.println(city.equals(city1));

	}

}
