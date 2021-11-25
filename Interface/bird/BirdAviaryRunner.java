package com.xworkz.inheritance.bird;

public class BirdAviaryRunner {

	public static void main(String[] args) {
	       
		
	    BirdDTO bird1=new BirdDTO("pe345", "pea-cock", 20, "Asia", true);
		BirdDTO bird2=new BirdDTO("OS678", "ostriches", 50, "Africa", false);
		
		BirdDAO dao=new ArrayBirdDAO();
		BirdAviary averyRef=new BirdAviary(dao);
		
		averyRef.saveDetails(bird1);
		averyRef.saveDetails(bird2);
		averyRef.displayDetails();
		averyRef.deleteDetails(1);
		averyRef.displayDetails();
		averyRef.updateDetails(1, bird2);
		averyRef.displayDetails();
		
		
		
		
		

	}

}
