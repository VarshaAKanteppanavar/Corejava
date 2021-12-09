package com.xworkz.overriding.icecream;

public class IceCreamRunner {

	public static void main(String[] args) {
		IceCream ice=new IceCream();
		IceCream ice1=new IceCream();
		ice.setFlavour(Flavour.COCOLATE);
		ice1.setFlavour(Flavour.COCOLATE);
		ice.setType(Type.CONE_ICECREAM);
		ice1.setType(Type.CONE_ICECREAM);
		System.out.println(ice.equals(ice1));
		System.out.println(ice.toString());
		System.out.println(ice.hashCode());
		

	}

}
