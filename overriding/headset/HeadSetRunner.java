package com.xworkz.overriding.headset;

public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet head=new HeadSet();
		HeadSet head1=new HeadSet();
		head.setBrand("samasung");
		head.setType(Type.EARBUDS);
		head1.setBrand("samasung");
		head1.setType(Type.EARBUDS);
		System.out.println(head.equals(head1));
		System.out.println(head.toString());
		System.out.println(head.hashCode());
		

	}

}
