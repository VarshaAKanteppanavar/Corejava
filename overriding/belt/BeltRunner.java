package com.xworkz.overriding.belt;

public class BeltRunner {

	public static void main(String[] args) {
		Belt belt=new Belt();
		Belt belt1=new Belt();
		belt.setGender('f');
		belt1.setGender('m');
		belt.setSize('s');
		belt1.setSize('s');
		System.out.println(belt.equals(belt1));
		System.out.println(belt.hashCode());
		System.out.println(belt.toString());
		
		

	}

}
