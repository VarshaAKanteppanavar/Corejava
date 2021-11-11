package com.xworkz.overriding.fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish=new Fish();
		Fish fish1=new Fish();
		fish.setColor("yellow");
		fish1.setColor("yellow");
		fish.setName("gold fish");
		fish1.setName("gold fish");
		System.out.println(fish.equals(fish1));
	}

}
