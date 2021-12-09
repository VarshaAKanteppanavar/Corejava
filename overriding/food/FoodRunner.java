package com.xworkz.overriding.food;

public class FoodRunner {

	public static void main(String[] args) {
		Food food=new Food();
		Food food1=new Food();
		food.setName("shira");
		food1.setName("shira");
		food.setQuality("good");
		food1.setQuality("bad");
		System.out.println(food.equals(food1));
		

	}

}
