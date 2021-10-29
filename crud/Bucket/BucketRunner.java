package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dp.dto.*;
public class BucketRunner {

	public static void main(String[] args) {
		BucketDTO BucketDTOs=new BucketDTO("Red", 'S', 100.0f, 3.0f, "xyz");
		BucketDTO BucketDTOs1=new BucketDTO("Blue", 'M', 150.0f, 10.0f, "xyz");
		BucketDTO BucketDTOs2=new BucketDTO("Yellow", 'S', 100.0f, 3.0f, "abc");
		
		BucketDAO bucket=new BucketDAO();
		bucket.save(BucketDTOs);
		bucket.save(BucketDTOs1);
		
       bucket.display();
       System.out.println("#######################################################");
       
       bucket.update(BucketDTOs2, 1);
       
		
		

	}

}
