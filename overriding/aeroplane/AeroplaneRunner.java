package com.xworkz.overriding.aeroplane;

public class AeroplaneRunner {

	public static void main(String[] args) {
		Aeroplane aer=new Aeroplane();
		Aeroplane aer1=new Aeroplane();
		aer.setName("air India");
		aer1.setName("air India");
		aer.setNo(987);
		aer1.setNo(987);
		System.out.println(aer.equals(aer1));
		
		

	}

}
