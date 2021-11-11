package com.xworkz.overriding.watch;

public class WatchRunner {

	public static void main(String[] args) {
		Watch watch=new Watch();
		watch.setBrand("fastrack");
		watch.setPrice(289.0f);
		Watch watch1=new Watch();
		watch1.setBrand("fastrack");
		watch1.setPrice(28.0f);
		
		System.out.println(watch.equals(watch1));
		
		
		
		
		
		
		
		
		

	}

}
