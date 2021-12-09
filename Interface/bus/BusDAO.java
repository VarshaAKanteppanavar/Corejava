package com.xworkz.inheritance.bus;

public interface BusDAO {
    boolean save(BusDTO busDtos);
	boolean delete(int index);
	int update(int index, BusDTO busDtos);
	void display();

}
