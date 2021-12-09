package com.xworkz.inheritance.bird;

public class BirdAviary {
	BirdDAO dao;

	public BirdAviary(BirdDAO dao) {
		super();
		this.dao = dao;
	}
	void saveDetails(BirdDTO dto)
	{
		if(dto!=null)
		{
			boolean saved=dao.save(dto);
			System.out.println(saved);
		}
	}
	void deleteDetails(int index)
	{
		boolean deleted=dao.delete(index);
		System.out.println(deleted);
	}
 void updateDetails(int index,BirdDTO dto)
 {
	int indexRef= dao.update(index, dto);
	System.out.println(indexRef);
 }
 void displayDetails()
 {
	 dao.display();
 }
 
}
