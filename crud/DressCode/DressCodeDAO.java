package com.xworkz.dp.dao;
import com.xworkz.dp.dao.*;
import com.xworkz.dp.dto.DressCodeDTO;
public class DressCodeDAO {
	private DressCodeDTO[] dresscodedtos=new DressCodeDTO[10];
	private int count=0;
	public void save(DressCodeDTO ref)
	{
		
		if(this.count<dresscodedtos.length && ref!=null)
		{
			this.dresscodedtos[count++]=ref;
		}
		else
		{
			System.err.println("Either container is full or passed reference is null");
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<dresscodedtos.length)
		{
			dresscodedtos[index]=null;
		}
		else
		{
			System.err.println("index is invalid");
		}
	}
	
	
	public void update(DressCodeDTO updateRef,int index)
	{
		if(updateRef!=null)
		{
			if(index>=0 && index<dresscodedtos.length)
			{
				this.dresscodedtos[index]=updateRef;
			}
			else
			{
				System.out.println("passed reference is not valid");
			}
		}
		else
		{
			System.out.println("reference You are passing is null");
		}
	}
	
	public void display()
	{
		for(int c=0;c<dresscodedtos.length;c++)
		{
			DressCodeDTO reference=dresscodedtos[c];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getColor());
			System.out.println(reference.getMaterial());
			System.out.println(reference.getSize());
			System.out.println(reference.getPrice());
			System.out.println(reference.getGender());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(c)));
			}
		}
	}	
}


