package com.xworkz.overriding.watch;

public class Watch {
	public String brand;
	public Type type;
	public float price;

	public Watch() {

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Watch)
			{
				Watch ref = (Watch) obj;
				String checkBrand = ref.getBrand();
				float checkPrice=ref.getPrice();
				Float cat=Float.valueOf(this.price);
				if (brand.equals(checkBrand) && cat.equals(checkPrice)) 
					
				{

					System.out.println("the object is matched");
					return true;
				} 
				else
				{
					System.out.println("the object is not matched");
					return false;
				}
			
			}

			else
				System.out.println("pass correct argument");
			return false;
		}
		return true;

	}
}
