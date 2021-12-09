package com.xworkz.overriding.bag;

public class Bag {
	private float price;
	private Color color;
	private int noOfSection;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getNoOfSection() {
		return noOfSection;
	}

	public void setNoOfSection(int noOfSection) {
		this.noOfSection = noOfSection;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Bag) {
				Bag bag=(Bag)obj;
				float checkPrice=bag.getPrice();
				Float cp= Float.valueOf(price);
				int checkSection=bag.getNoOfSection();
				Integer cs=Integer.valueOf(noOfSection);
				if(cp.equals(checkPrice) && cs.equals(checkSection)) {
					System.out.println("the content is matched");
					return true;
			}
				else {
					System.err.println("the content is not matched");
					return false;
				}
		}
			else 
			{
			System.err.println("the value is invalid");
			return false;
		}
		}
		return false;
	}

}
