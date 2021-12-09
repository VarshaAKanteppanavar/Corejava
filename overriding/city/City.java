package com.xworkz.overriding.city;

public class City {
	private String name;
	private String stateName;
	private String country;
	 public City() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
   @Override
public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof City) {
			City city=(City)obj;
			String checkName=city.getName();
			String checkCountry= city.getCountry();
			
			if(this.name.equals(checkName) && this.country.equals(checkCountry)) {
				System.out.println("matched");
				return true;
			}
		else {
			System.out.println("not matched");
			return false;
		}
	}else {System.out.println("correct dtata type");
	return false;
	}
	}
	 return false;
}
   
}