package com.xworkz.inheritance.airport;

public class Airport1Runner {

	public static void main(String[] args) {
		Airport1DTO air=new Airport1DTO("67", "Kempegowda International Airport", "Bengalore", "international");
		Airport1DTO air1=new Airport1DTO("60", "Chenni Intarnational Airport", "chenni", "international");
		Airport1DTO air2=new Airport1DTO("65", "Cochin Intarnational Airport", "Karipur", "international");
		Airport1DAO dao=new ArrayAirportDAO();
		Airport1  ref=new Airport1(dao);
		
		ref.saveDetails(air);
		ref.saveDetails(air1);
		ref.saveDetails(air2);
		
		ref.displayDetails();
		ref.deleteDetails(1);
		ref.displayDetails();
		ref.updateDetails(1, air);
		ref.displayDetails();
		

	}

}
