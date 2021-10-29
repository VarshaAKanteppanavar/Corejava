package com.xworkz.dp.dao;

import com.xworkz.dp.dto.*;
public class WebSeriesDAO {
	private WebSeriesDTO[] webSeriesDTOs=new WebSeriesDTO[10];
	private int count=0;
	public void save(WebSeriesDTO ref)
	{
		
		if(this.count<webSeriesDTOs.length && ref!=null)
		{
			this.webSeriesDTOs[count++]=ref;
		}
		else
		{
			System.err.println("Either container is full or passed reference is null");
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<webSeriesDTOs.length)
		{
			webSeriesDTOs[index]=null;
		}
		else
		{
			System.err.println("index is invalid");
		}
	}
	
	
	public void update(WebSeriesDTO updateRef,int index)
	{
		if(updateRef!=null)
		{
			if(index>=0 && index<webSeriesDTOs.length)
			{
				this.webSeriesDTOs[index]=updateRef;
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
		for(int coke=0;coke<webSeriesDTOs.length;coke++)
		{
			WebSeriesDTO reference=webSeriesDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getName());
			System.out.println(reference.getCast());
			System.out.println(reference.getNoOfCharectors());
			System.out.println(reference.getRating());
			System.out.println(reference.getNoOfseasons());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		}
	}	
}
