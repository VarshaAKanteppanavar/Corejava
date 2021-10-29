package com.xworkz.dp.dao;
import com.xworkz.dp.dto.*;
public class CircusDAO {

	private CircusDTO[] circusDTOs=new CircusDTO[30];
	private int jilebi;
	public void save(CircusDTO ref)
	{
		if(ref!=null)
		{
			this.circusDTOs[this.jilebi++]=ref;
		}
		else
		{
			System.out.println("you are passing null reference");
		}
	}
	
	
	public void display()
	{
		for(int i=0;i<this.circusDTOs.length;i++)
		{
			CircusDTO circusRef=circusDTOs[i];
			if(circusRef!=null)
			{
				System.out.println(circusRef);
				System.out.println(circusRef.getOwner());
				System.out.println(circusRef.getTicketPrice());
				System.out.println(circusRef.getNumberOfShows());
				System.out.println(circusRef.getDurationInHour());
				System.out.println(circusRef.getNumberOfAnimals());
			}
			else
			{
				System.err.println("Pointing to null at index".concat(String.valueOf(i)));
				
			}
		}
	}
	
	
	public void delete(int index)
	{
		if(index>=0 && index<this.circusDTOs.length)
		{
			this.circusDTOs[index]=null;
			this.jilebi--;
		}
	}
	
	public void update(CircusDTO ref,int index)
	{
		if(ref!=null && index<this.circusDTOs.length && index>=0)
		{
			this.circusDTOs[index]=ref;
			this.jilebi++;
		}
		else
		{
			System.err.println("cannot update either index is invalid or reference is null");
		}
	}
	
	public int numberOfIndex()
	{
		return this.jilebi;
	}
	
	public boolean match(String name)
	{
		for(int index=0;index<this.circusDTOs.length;index++)
		{
			CircusDTO matchName=circusDTOs[index];
			if(matchName!=null)
			{
			if(matchName.getOwner().equals(name))
			{
				return true;
			}
			}

		}
		return false;
	}
}

}
