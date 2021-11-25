package com.xworkz.inheritance.bus;


public class BusRouter {
	BusDAO dao;
	
	public BusRouter(BusDAO dao) {
		super();
		this.dao=dao;
	}
	void saveDetails(BusDTO dto)
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
 void updateDetails(int index,BusDTO dto)
 {
	int indexRef= dao.update(index, dto);
	System.out.println(indexRef);
 }
 void displayDetails()
 {
	 dao.display();
 }
 

}
