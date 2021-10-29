package com.xworkz.dp.dto;

public class WebSeriesDTO {
	private String name;
	private String cast;
	private int noOfCharectors;
	private float rating;
	private int noOfseasons;
	
	
	public void WebSeriesDTO() {
		
	}

	public WebSeriesDTO(String name, String cast, int noOfCharectors, float rating, int noOfseasons) {
		super();
		this.name = name;
		this.cast = cast;
		this.noOfCharectors = noOfCharectors;
		this.rating = rating;
		this.noOfseasons = noOfseasons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public int getNoOfCharectors() {
		return noOfCharectors;
	}

	public void setNoOfCharectors(int noOfCharectors) {
		this.noOfCharectors = noOfCharectors;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getNoOfseasons() {
		return noOfseasons;
	}

	public void setNoOfseasons(int noOfseasons) {
		this.noOfseasons = noOfseasons;
	}
    
}
