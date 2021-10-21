package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class BeachStarter {

	public static void main(String[] args) {

		Beachoperator beach = new Beachoperator();

		String country = beach.getCountry();
		System.out.println(country);
		beach.addBeach("Taghor beach");
		beach.addBeach("om beach");
		beach.addBeach("baga beach");
		beach.addBeach("malpe beach");
		beach.addBeach("karwar beach");
		beach.addBeach("gokarna beach");
		beach.displaybeach();
		System.out.println();
		System.out.println();

		Beachoperator choco = new Beachoperator();
		choco.addchocolate("diary milk");
		choco.addchocolate(" milky bar");
		choco.addchocolate("eclase");
		choco.addchocolate("kacha mango");
		choco.addchocolate("gems");
		choco.addchocolate("perk");
		choco.displaychocolate();
		System.out.println();
		System.out.println();

		Beachoperator gn = new Beachoperator();
		gn.addgin("monkey 47");
		gn.addgin(" beefeater gin");
		gn.addgin("bombay Sapphire");
		gn.addgin("tanqueray");
		gn.addgin("hendricks gin");
		gn.addgin("gin mare");
		gn.displaygin();
		System.out.println();
		System.out.println();

		Beachoperator rn = new Beachoperator();
		rn.addrestorent("udapi restorent");
		rn.addrestorent("megha darshini");
		rn.addrestorent("mathura palace");
		rn.addrestorent("andra ruchilu");
		rn.addrestorent("Tandoor dum");
		rn.addrestorent("halli mane");
		rn.displayrestorent();
		System.out.println();
		System.out.println();
		
		Beachoperator rstn = new Beachoperator();
		rstn.addresort("dandeli resort");
		rstn.addresort(" riva beach resort");
		rstn.addresort("wild planet resort");
		rstn.addresort("kumarakom resort");
		rstn.addresort("karma royal resort");
		rstn.addresort("kikar resort");
		rstn.displayresort();
		System.out.println();
		System.out.println();
		
		Beachoperator wn = new Beachoperator();
		wn.addwaterfalls("jog falls");
		wn.addwaterfalls("dudhasagar");
		wn.addwaterfalls("chitrkote falls");
		wn.addwaterfalls("kunchikal falls");
		wn.addwaterfalls("shivanasamudra");
		wn.addwaterfalls("nokalikai");
		wn.displaywaterfalls();
		System.out.println();
		System.out.println();


	}

}
