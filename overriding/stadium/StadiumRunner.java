package com.xworkz.overriding.stadium;

public class StadiumRunner {

	public static void main(String[] args) {
		Stadium stadium=new Stadium();
		Stadium stadium1=new Stadium();
		stadium.setName("Narendr Modi Stadium");
		stadium1.setName("Narendr Modi Stadium");
		stadium.setCity("Ahmedabad");
		stadium1.setCity("Ahmedabad");
		System.out.println(stadium.equals(stadium1));
		

	}

}
