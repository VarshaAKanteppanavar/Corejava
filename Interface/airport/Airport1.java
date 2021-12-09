package com.xworkz.inheritance.airport;



public class Airport1 {
	Airport1DAO dao;
	
	public Airport1(Airport1DAO dao) {
		super();
		this.dao=dao;
	}
	void saveDetails(Airport1DTO dto)
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
 void updateDetails(int index,Airport1DTO dto)
 {
	int indexRef= dao.update(index, dto);
	System.out.println(indexRef);
 }
 void displayDetails()
 {
	 dao.display();
 }
 

}



