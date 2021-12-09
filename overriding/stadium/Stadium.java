package com.xworkz.overriding.stadium;

public class Stadium {
	private String name;
	private String city;
	private String area;
	
	public Stadium() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Stadium) {
				Stadium stadium=(Stadium)obj;
				String checkName=stadium.getName();
				String checkCity=stadium.getCity();
				if(this.name.equals(checkName) && this.city.equals(checkCity)) {
					System.out.println("matched");
					return true;
				}else {System.out.println("not matched");
				return false;
				}
			}else {
				System.out.println("data type is not correct");
				return false;
			}
		}
		return false;
	}

}
