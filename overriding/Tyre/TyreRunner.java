package com.xworkz.overriding.Tyre;

public class TyreRunner {

	public static void main(String[] args) {
		Tyre tyre=new Tyre();
		Tyre tyre1=new Tyre();
		tyre.setBrand("CEAT Tyres");
		tyre1.setBrand("CEAT Tyres");
		tyre.setType("Byke");
		tyre1.setType("Byke");
		System.out.println(tyre.equals(tyre1));
		
		

	}

}
