package com.xworkz.overriding.socks;

public class SocksRunner {

	public static void main(String[] args) {
		Socks socks=new Socks();
		Socks socks1=new Socks();
		socks.setMaterial(Material.COTTON);
		socks1.setMaterial(Material.NYLONE);
		socks.setType(Type.ANCKLE);
		socks1.setType(Type.ANCKLE);
		System.out.println(socks.hashCode());
		System.out.println(socks.toString());
		System.out.println(socks.equals(socks1));
		
		

	}

}
