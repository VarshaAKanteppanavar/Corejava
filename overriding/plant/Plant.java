package com.xworkz.overriding.plant;

public class Plant {
	public String name;
	public boolean alive;
	public float lifeSpan;
	public Type type;

	public Plant() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public float getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(float lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Plant) {
				Plant plant = (Plant) obj;
				String checkName = plant.getName();
				boolean checkAlive = plant.isAlive();
				Boolean isAlive=Boolean.valueOf(checkAlive);

				if (this.name.equals(checkName) && isAlive.equals(checkAlive))
				{
				System.out.println("matched");
				return true;
				}
			
			    else {
				System.err.println("the object is not matched");
				return false;
			     }
			}
			
			    
			else {
			System.err.println("the value passed is null");
			return false;
			}
			
		}
		return false;
	}

}
	
