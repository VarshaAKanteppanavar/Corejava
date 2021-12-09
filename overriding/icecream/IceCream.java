package com.xworkz.overriding.icecream;

public class IceCream {
	public String name;
	public Flavour flavour;
	public Type type;
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flavour getFlavour() {
		return flavour;
	}
	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		System.out.println("invoke the toString");
		return super.toString();
	}
	@Override
	public int hashCode() {
		System.out.println("invoke the hasCode");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof IceCream) {
				IceCream ice=(IceCream)obj;
				Flavour checkFlavour=ice.getFlavour();
				Type checkType=ice.getType();
				if(this.flavour.equals(checkFlavour) && this.type.equals(checkType)) {
				System.out.println("matched");
				return true;
			}
			else {
				System.err.println("pass correct value");
				return false;
				}
			}
		else {
				System.err.println("not matched");
				return false;
			}
		}
		return false;
	}
	
}
