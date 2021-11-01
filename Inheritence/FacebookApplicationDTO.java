package com.xworkz.application;

public class FacebookApplicationDTO extends ApplicationDTO {
	private String ceoName="Mark ";
	private String headQuarter="California";
	public FacebookApplicationDTO() {
		System.out.println("invoke the no arg const FacebookApplicationDTO");
		
	}
	public FacebookApplicationDTO(String ceoName, String headQuarter) {
		super();
		this.ceoName = ceoName;
		this.headQuarter = headQuarter;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getHeadQuarter() {
		return headQuarter;
	}
	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}
	
	 
	
}

	


