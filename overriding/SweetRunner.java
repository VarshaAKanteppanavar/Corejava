package com.xworkz.overriding;

public class SweetRunner {

	public static void main(String[] args) {
		DharwadPeda sweet = new DharwadPeda();
		Sweet sweet1 = new Sweet("kaju barfi", "Dehli", 550.0f);
		sweet.getClass();
		System.out.println(sweet1);
		sweet.making();
		sweet1.sweetdisplay();

		sweet.display();
		sweet.selling();

	}

}
