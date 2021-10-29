package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dp.dto.*;
public class CircusDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircusDTO circusDTOs1=new CircusDTO("renu",45.5f,25,3,2);
		CircusDTO circusDTOs2=new CircusDTO("varsha",40.5f,30,4,2);
		CircusDTO circusDTOs3=new CircusDTO("shruti",46.5f,35,1,2);
		
		CircusDAO circusDAOs=new CircusDAO();
		circusDAOs.save(circusDTOs1);
		circusDAOs.save(circusDTOs2);
		
		circusDAOs.display();
		int indexNumber=circusDAOs.numberOfIndex();
		System.out.println("Number of indexes is".concat(String.valueOf(indexNumber)));
		
		circusDAOs.delete(-3);
		
		circusDAOs.update(circusDTOs3, 9);
		indexNumber=circusDAOs.numberOfIndex();
		System.out.println("Number of indexes is".concat(String.valueOf(indexNumber)));
		
		boolean found=circusDAOs.match("renu");
		System.out.println("found ".concat(String.valueOf(found)));
	}

}

}
