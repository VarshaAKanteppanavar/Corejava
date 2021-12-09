package com.xworkz.inheritance.airport;



public class ArrayAirportDAO implements Airport1DAO{
	Airport1DTO[] airport = new Airport1DTO[6];
	int count=0;
	@Override
	public boolean save(Airport1DTO airportDtos) {
		System.out.println("invoked save");
		if (airportDtos != null && count < this.airport.length) {
			airport[count++] = airportDtos;
			return true;

		}
		return false;
	}

	@Override
	public void display() {
		System.out.println("invoked display");
		for (int i = 0; i < airport.length; i++) {
			Airport1DTO ref = airport[i];
			if(ref!=null) {
			System.out.println(ref.getId());
			System.out.println(ref.getName());
			System.out.println(ref.getLocation());
			System.out.println(ref.getType());

		}else {
			System.out.println("you have given null");
		}
		}
	}
	@Override
	public int update(int index, Airport1DTO airport1Dtos) {
		System.out.println("invoked update");
		return 0;
	}

	@Override
	public boolean delete(int index) {
		System.out.println("invoked delete");
		return false;
	}
}



