package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dp.dto.*;
public class DoctorDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorDTO doctorDTOs1=new DoctorDTO("sumita","heart specialist","renuka hospital",'f',450000.3f,34);
		DoctorDTO doctorDTOs2=new DoctorDTO("Ganesh","dermotologist","suraskha hospital",'M',350000.3f,28);
		DoctorDTO doctorDTOs3=new DoctorDTO("venakat","cardiologits","brunda hospital",'M',39000.3f,34);
		
		
	DoctorDAO doctorDAOs=new DoctorDAO();
	doctorDAOs.save(doctorDTOs1);
	doctorDAOs.save(doctorDTOs2);
	
	doctorDAOs.display();
	doctorDAOs.delete(-9);
	doctorDAOs.update(doctorDTOs3,39);
	int number=doctorDAOs.numberOfIndexes();
	System.out.println("total number of index ".concat(String.valueOf(number)));
	boolean found=doctorDAOs.match(null);
	System.out.println("found ".concat(String.valueOf(found)));
	
	}

}


