package com.xworkz.inheritance.airport;



public interface Airport1DAO {
	boolean save(Airport1DTO airportDtos);
	boolean delete(int index);
	int update(int index, Airport1DTO airportDtos);
	void display();
}
