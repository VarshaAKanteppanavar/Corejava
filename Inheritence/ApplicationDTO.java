package com.xworkz.application;

public class ApplicationDTO {
	private String name;
	private String verasion;
	private String company;
	private String founder;
	public ApplicationDTO() {
		System.out.println("invoke no arg constructore ApplicationDTO");
	}
	public ApplicationDTO(String name, String verasion, String company, String founder) {
		super();
		this.name = name;
		this.verasion = verasion;
		this.company = company;
		this.founder = founder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVerasion() {
		return verasion;
	}
	public void setVerasion(String verasion) {
		this.verasion = verasion;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
	
}
