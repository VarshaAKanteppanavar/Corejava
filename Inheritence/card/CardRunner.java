package com.xworkz;

import com.xworkz.card.AtmCard;
import com.xworkz.card.Card;
import com.xworkz.card.UnoCard;

public class CardRunner {

	public static void main(String[] args) {
		Card card = new Card();

		System.out.println(card.name);
		System.out.println(card.material);
		System.out.println(card.noOfCard);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		AtmCard atm = new AtmCard();
		System.out.println(atm.creditCard);
		System.out.println(atm.material);
		System.out.println(atm.name);
		System.out.println(atm.noOfCard);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		UnoCard uno = new UnoCard();
		System.out.println(uno.material);
		System.out.println(uno.name);
		System.out.println(uno.noOfCard);
		System.out.println(uno.Playing);

		Card card1 = new AtmCard();
		if (card1 instanceof AtmCard) {
			AtmCard atm1 = (AtmCard) card1;

			System.out.println(atm1.material);
			System.out.println(atm1.name);
			System.out.println(atm1.noOfCard);
			System.out.println(atm1.creditCard);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

		Card card2 = new UnoCard();
		if (card2 instanceof UnoCard) {
			UnoCard uno1 = (UnoCard) card2;
			System.out.println(uno1.material);
			System.out.println(uno1.name);
			System.out.println(uno1.noOfCard);
			System.out.println(uno1.Playing);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}
		// Object

		Object obj = new Card();
		if (obj instanceof Card) {
			Card card3 = (Card) obj;
			System.out.println(card3.material);
			System.out.println(card3.name);
			System.out.println(card3.noOfCard);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

		Object obj1 = new AtmCard();
		if (obj1 instanceof AtmCard) {
			AtmCard atm2 = (AtmCard) obj1;
			System.out.println(atm2.creditCard);
			System.out.println(atm2.material);
			System.out.println(atm2.name);
			System.out.println(atm2.noOfCard);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

		Object obj2 = new UnoCard();
		if (obj2 instanceof UnoCard) {
			UnoCard uno2 = (UnoCard) obj2;
			System.out.println(uno2.material);
			System.out.println(uno2.name);
			System.out.println(uno2.noOfCard);
			System.out.println(uno2.Playing);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

		// array

		Card[] cardRef = new Card[4];
		cardRef[0] = atm;
		cardRef[1] = uno;

		for (int sikka = 0; sikka < cardRef.length; sikka++) {
			if (cardRef[sikka] instanceof AtmCard) {
				AtmCard atm3 = (AtmCard) cardRef[sikka];
				{
					System.out.println(atm3.creditCard);
					System.out.println(atm3.material);
					System.out.println(atm3.name);
					System.out.println(atm3.noOfCard);
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				}
			}

			if (cardRef[sikka] instanceof UnoCard) {
				UnoCard uno3 = (UnoCard) cardRef[sikka];
				{

					System.out.println(uno3.material);
					System.out.println(uno3.name);
					System.out.println(uno3.noOfCard);
					System.out.println(uno3.Playing);
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				}
			}

		}

	}

}
