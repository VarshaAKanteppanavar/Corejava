package com.xworkz.dp;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class LawyerRunner {

	public static void main(String[] args) {
		LawyerDTO lawyer=new LawyerDTO("Sagar","BALLB", 6, 'M',35,"India",5,7);
		LawyerDTO lawyer1=new LawyerDTO("Akshu","MALLB",10,'F',50,"USA",10,0);
		LawyerDTO lawyer2=new LawyerDTO("renavva","LLB", 2, 'F', 28, "india", 1, 0);
        
		LawyerDAO law=new LawyerDAO();
		law.save(lawyer1);
		law.save(lawyer);
		law.save(lawyer2);
		boolean ref = law.searchByName("Akshu");
		System.out.println(ref);
		boolean ref1 = law.searchByCaseWon(10);
		System.out.println(ref1);
		law.save(lawyer, 3);
		String name=law.getExpByName("Anusha");
		System.out.println(name);
		String name1 = law.getQualificationByName("Ambika");
		System.out.println(name1);
		float temp = law.getlawyerwithMaxExp();
		System.out.println(temp);
		law.display();
		
		
		
	    law.delete(1);

}
}