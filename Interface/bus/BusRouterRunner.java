package com.xworkz.inheritance.bus;



public class BusRouterRunner {

	public static void main(String[] args) {
		BusDTO bus = new BusDTO("Hubli", "Rajesh", "1232", "Dharwad");
		BusDTO bus1=new BusDTO("Udupi","Manoj", "9078", "Hubli");
		BusDTO bus2=new BusDTO("Bijapur", "Santosh", "3456", "Benglore");
		BusDTO bus3=new BusDTO("Gadag", "Sanjay", "7564", "Benglore");
		BusDAO dao=new ArrayBusDAO();
		BusRouter  ref=new BusRouter(dao);
		
		ref.saveDetails(bus1);
		ref.saveDetails(bus2);
		ref.saveDetails(bus);
		ref.saveDetails(bus3);
		ref.displayDetails();
		ref.deleteDetails(1);
		ref.displayDetails();
		ref.updateDetails(1, bus2);
		ref.displayDetails();
		

	}

}
