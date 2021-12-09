package com.xworkz.overriding.belt;

public class Belt {
	private float price;
	private String material;
	private char size;
	private char gender;

	public Belt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Belt) {
				Belt belt = (Belt) obj;
				char checkSize = belt.getSize();
				char checkGender = belt.getGender();
				Character cs = Character.valueOf(checkSize);
				Character cg = Character.valueOf(checkGender);

				if (cs.equals(size) && cg.equals(gender)) {
					System.out.println("matched");
					return true;

				}else
				{
					System.out.println("not matched");
					return false;
					
				}
			}else
			{
				System.out.println("the data type is not correct");
				return false;
				
			}
		}
		return false;
	}

}
