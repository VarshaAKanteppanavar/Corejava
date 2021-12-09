package com.xworkz.dp.dao;
import com.xworkz.dp.dto.*;
public class LawyerDAO {
	private LawyerDTO[] layerDAO=new LawyerDTO[10];
	private int ambi=0;
	
	public void save(LawyerDTO ref) {
		if(this.ambi<layerDAO.length && this.ambi>=0 && ref!=null)
		{
			this.layerDAO[ambi++]=ref;
			System.out.println("save: ".concat(ref.getName()));
			System.out.println("save: ".concat(ref.getQualification()));
			System.out.println("save: ".concat(String.valueOf(ref.getAge())));
			System.out.println("save:".concat(String.valueOf(ref.getCasesLost())));
			System.out.println("save: ".concat(String.valueOf(ref.getCasesWon())));
			System.out.println("save: ".concat(String.valueOf(ref.getGender())));
		}else
		{
			System.err.println("container is full or you have entered null");
		}
	}
	public void delete(int index)
	{
		if(this.ambi<layerDAO.length && this.ambi>=0)
		{
			this.layerDAO[index]=null;
			this.ambi--;
			System.out.println("deleted: ".concat(String.valueOf(index)));
		}else {
			System.err.println("index entred not correct");
		}
		
	}
	public boolean searchByName(String name) {
		for (int i = 0; i < layerDAO.length; i++) {
			LawyerDTO ref=this.layerDAO[i];
			if(ref!=null) {
				String tempName=ref.getName();
				System.out.println("name:" .concat(tempName));
				if(tempName.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean searchByCaseWon(int caseWon) {
		for (int i = 0; i < layerDAO.length; i++) {
			LawyerDTO ref=this.layerDAO[i];
			if(ref!=null) {
				int tempCaseWon=ref.getCasesWon();
				System.out.println("caseWon:" .concat(String.valueOf(tempCaseWon )));
				if(tempCaseWon==caseWon) {
				System.out.println("caseWon found");	
					return true;
				}
			}
			
		}
		return false;
		
	}
	public void save(LawyerDTO dto, int index) {
		if(index>=0 && index<layerDAO.length && dto!=null) {
			this.layerDAO[index]=dto;
			System.out.println("lawyerDTO at index:" .concat(String.valueOf(index)));
		}
		else {
			System.err.println("inavalid index");
		}
	}
	public String getQualificationByName(String name) {
		for (int i = 0; i < layerDAO.length; i++) {
			LawyerDTO ref=this.layerDAO[i];
			if(ref!=null) {
				String tempName=ref.getName();
				if(tempName.equals(name)) {
					return ref.getQualification();
				}
		}	
	}
		return "qualification not found";
		
	}
	public String getExpByName(String name) {
		for (int i = 0; i < layerDAO.length; i++) {
			LawyerDTO ref=this.layerDAO[i];
			if(ref!=null) {
				String tempName=ref.getName();
				if(tempName.equals(name)) {
					System.out.println("experience:");
					return String.valueOf(ref.getExperience());
				}
			}
		}
		return "experience not found";
		
	}
	public LawyerDTO[] getLawyerDTOs() {
		return layerDAO;
	}
	public float getlawyerwithMaxExp( ) {
		float tempMax = 0;
		if(layerDAO[0]!=null) {
	    tempMax=layerDAO[0].getExperience();
		for (int i = 1; i < layerDAO.length; i++) {
			LawyerDTO ref=layerDAO[i];
			
			if(ref!=null) {
				
				float temp=ref.getExperience();
				if(temp>tempMax) {
					System.out.println("9999");
					tempMax=temp;
					
				}
				else {
					System.err.println("77777");
				}
				
		}
		
			}
		
		}
		return tempMax ;
		
	}
	public void display() {
		for (int i = 0; i < layerDAO.length; i++) {
			LawyerDTO ref=layerDAO[i];
			if(ref!=null) {
				System.out.println(i);
				System.out.println(ref.getAge());
				System.out.println(ref.getCasesWon());
				
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getName());
			}
			
		}
	}

	
}
