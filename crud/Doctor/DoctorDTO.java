package com.xworkz.dp.dto;

public class DoctorDTO {
	private String name;
	private String specialization;
	private String hospitalName;
	private char gender;
	private float salary;
	private int age;
	
	public DoctorDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoking DoctorDTO constructor");
	}

	public DoctorDTO(String name, String specialization, String hospitalName, char gender, float salary, int age) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	


}
