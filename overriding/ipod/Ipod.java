package com.xworkz.overriding.ipod;

public class Ipod {
	public int modelNo;

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public int hashCode() {
		System.out.println("invoke the hashCode");
		return super.hashCode();
	}

	public Ipod() {
		System.out.println("invoke the no arg constructor Ipod");

	}

	public void modelNo() {
		System.out.println(this.modelNo);

	}

}
