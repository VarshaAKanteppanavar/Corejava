package com.xworkz.overriding.plant;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant=new Plant();
		Plant plant2=new Plant();
		plant.setName("Banana");
		plant.setAlive(false);
		plant2.setName("Banana");
		plant2.setAlive(false);
		System.out.println(plant.equals(plant2));
		
		

	}

}
