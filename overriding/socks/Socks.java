package com.xworkz.overriding.socks;

public class Socks {
	private char size;
	private float price;
	private Material material;
	private Type type;
	public Socks() {
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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Socks) {
				Socks socks=(Socks)obj;
				Material checkMaterial=socks.getMaterial();
				Type checkType=socks.getType();
				
				if(this.material.equals(checkMaterial) && this.type.equals(checkType)) {
					System.out.println("matched");
					return true;
				}
				else
				{
					System.out.println("not matched");
					return false;
				}
			}
			else
			{
				System.out.println("not correct data type");
				return false;
			}
		}
		return false;
	}
}
