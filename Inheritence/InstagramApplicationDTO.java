package com.xworkz.application;

public class InstagramApplicationDTO extends ApplicationDTO{
	private float totalUsers;
	private String serverLocation;
	public InstagramApplicationDTO() {
		System.out.println("invoke the no arg const InstagramApplication");
	}
	public InstagramApplicationDTO(float totalUsers, String serverLocation) {
		super();
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}
	public float getTotalUsers() {
		return totalUsers;
	}
	public void setTotalUsers(float totalUsers) {
		this.totalUsers = totalUsers;
	}
	public String getServerLocation() {
		return serverLocation;
	}
	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}
	

}
