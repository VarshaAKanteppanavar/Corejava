package com.xworkz.dp.dao;
import com.xworkz.dp.dto.*;

public class BucketDAO {
	private BucketDTO[] BucketDAOs=new BucketDTO[10];
	private  int count=0;
	  
	public void save(BucketDTO ref)
	{
		if(this.count<BucketDAOs.length && ref!=null)
		{
          this.BucketDAOs[this.count++]=ref;
		}
		else {
			System.err.println("invoke the correct ref value");
			
		}
		
		
	}
	public void display(){
		for(int b=0;b<BucketDAOs.length;b++ )
		{
			BucketDTO buc=BucketDAOs[b];
			if(buc!=null) {
			
			System.out.println(buc.getColor());
			System.out.println(buc.getCompany());
			System.out.println(buc.getPrice());
	
	        
			
			}
			
			
		}
	}
	public void update(BucketDTO updateref,int index) {
		if(updateref!=null) {
			if(index>=0 && index<BucketDAOs.length)
			{
				this.BucketDAOs[index]=updateref;
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
}

		
	


