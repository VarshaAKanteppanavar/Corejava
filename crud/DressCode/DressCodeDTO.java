package com.xworkz.dp.dto;
import com.xworkz.dp.*;

public class DressCodeDTO {
	private String color;
	private Material material;
	private char size;
	private float price;
	private char gender;
	public DressCodeDTO() {
		// TODO Auto-generated constructor stub
	}
	public DressCodeDTO(String color, Material material, char size, float price, char gender) {
		super();
		this.color = color;
		this.material = material;
		this.size = size;
		this.price = price;
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
