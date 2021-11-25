package com.xworkz.inheritance.bird;

public interface BirdDAO {
	boolean save(BirdDTO birdDtos);
	boolean delete(int index);
	int update(int index, BirdDTO birdDtos);
	void display();

}
