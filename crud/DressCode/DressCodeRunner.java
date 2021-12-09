package com.xworkz.dp;

import com.xworkz.dp.*;
import com.xworkz.dp.dto.DressCodeDTO;
import com.xworkz.dp.dao.DressCodeDAO;

public class DressCodeRunner {

	public static void main(String[] args) {
		DressCodeDTO dresscodeDTOs=new DressCodeDTO("blue", Material.NYLON,'M',200.0f,'F');
		DressCodeDTO dresscodeDTOs1=new DressCodeDTO("blue", Material.NYLON,'L',250.0f,'M');
		DressCodeDTO dresscodeDTOs2=new DressCodeDTO("black", Material.COTTON,'S',400.0f,'F');
		
		
		DressCodeDAO dress=new DressCodeDAO();
		dress.save(dresscodeDTOs);
		dress.save(dresscodeDTOs1);
		
		
		dress.display();
		
		dress.delete(-1);
		dress.delete(0);
		
		dress.display();
		
		
		dress.update(dresscodeDTOs1,6);
		
		dress.display();
		
		
	}

	}


