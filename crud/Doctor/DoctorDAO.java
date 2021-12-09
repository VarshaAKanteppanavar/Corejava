package com.xworkz.dp.dao;
import com.xworkz.dp.dto.*;
public class DoctorDAO {
	private DoctorDTO[] doctorDTOs=new DoctorDTO[39];
	private int injection;
	public void save(DoctorDTO ref)
	{
		if(ref!=null)
		{
		     this.doctorDTOs[injection++]=ref;
		}
		else
		{
			System.err.println("Cannot add ,refernce is null ");
		}
	}
	
	public void display()
	{
		for(int index=0;index<this.doctorDTOs.length;index++)
		{
			DoctorDTO ref=this.doctorDTOs[index];
			if(ref!=null)
			{
				System.out.println(ref);
				System.out.println(ref.getName());
				System.out.println(ref.getHospitalName());
				System.out.println(ref.getSpecialization());
				System.out.println(ref.getSalary());
				System.out.println(ref.getGender());
				System.out.println(ref.getAge());
			
			}
			else
			{
				System.err.println("pointing to null at index".concat(String.valueOf(index)));
				
			}
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<this.doctorDTOs.length)
		{
			this.doctorDTOs[index]=null;
			this.injection--;
		}
		else
		{
			System.err.println("cannot delete at index".concat(String.valueOf(index)));
			
		}
	}
	
	
	public void update(DoctorDTO ref,int index)
	{
		if(index<this.doctorDTOs.length && index>=0 && ref!=null)
		{
			this.doctorDTOs[index]=ref;
		}
		else
		{
			System.err.println("cannot update ,either index is invalid or refernce is null at index".concat(String.valueOf(index)));
		}
	}
	public int numberOfIndexes()
	
	{
		return this.injection;
	}
	
	public boolean match(String hospitalName)
	{
		for(int tablet=0;tablet<this.doctorDTOs.length;tablet++)
		{
			DoctorDTO hospital=doctorDTOs[tablet];
			if(hospital!=null)
			{
			if(hospital.getHospitalName().equals(hospitalName))
			{
				return true;
			}
			}
		}
		return false;
	}
	
}


