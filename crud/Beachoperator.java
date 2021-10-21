package com.xworkz.crud.operator;

public class Beachoperator {
	private String country = new String();
	private String[] beachnames = new String[5];
	private String[] chocolatenames = new String[5];
	private String[] ginnames = new String[5];
	private String[] restorentnames = new String[5];
	private String[] resortnames=new String[5];
	private String[] waterfallsnames=new String[5];
	private int counter = 0;

	public Beachoperator() {
		this("INDIA");
		System.out.println("invoke the country");

	}

	public Beachoperator(String cname) {
		this.country = cname;

	}
//getter method
	public String getCountry() {
		return this.country;
	}

	public void addBeach(String name)

	{
		System.out.println("added argumant ".concat(name));
		if (counter < beachnames.length)

		{
			System.out.println("invoke addBeach");

			this.beachnames[counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full");
		}

	}

	public void displaybeach() {
		for (int rasgulla = 0; rasgulla < beachnames.length; rasgulla++) {
			String nbeach = beachnames[rasgulla];
			System.out.println(nbeach);
		}
	}

	public void addchocolate(String choconames)

	{
		System.out.println("added choconames ".concat(choconames));
		if (counter < chocolatenames.length) {
			System.out.println("invoke chocolate name");
			this.chocolatenames[counter] = choconames;
			this.counter++;
		} else {
			System.err.println("array full");
		}

	}

	public void displaychocolate() {
		for (int c = 0; c < chocolatenames.length; c++) {
			String coname = chocolatenames[c];
			System.out.println(coname);

		}
	}

	public void addgin(String gnames)

	{
		System.out.println("added ginnames ".concat(gnames));
		if (counter < ginnames.length) {
			System.out.println("invoke gin name");
			this.ginnames[counter] = gnames;
			this.counter++;
		} else {
			System.err.println("array full");
		}

	}

	public void displaygin() {
		for (int g = 0; g < ginnames.length; g++) {
			String gname = ginnames[g];
			System.out.println(gname);
		}
	}

	public void addrestorent(String rnames)

	{
		System.out.println("added restorentnames ".concat(rnames));
		if (counter < restorentnames.length) {
			System.out.println("invoke restorent name");
			this.restorentnames[counter] = rnames;
			this.counter++;
		} else {
			System.err.println("array full");
		}

	}

	public void displayrestorent() {
		for (int r = 0; r < restorentnames.length; r++) {
			String rname = restorentnames[r];
			System.out.println(rname);
		}
	}
	public void addresort(String rtnames)

	{
		System.out.println("added resortnames ".concat(rtnames));
		if (counter < restorentnames.length) {
			System.out.println("invoke restorent name");
			this.resortnames[counter] = rtnames;
			this.counter++;
		} else {
			System.err.println("array full");
		}

	} public void displayresort() {

		for (int rt = 0; rt < resortnames.length; rt++) {
			String rstname = resortnames[rt];
			System.out.println(rstname);
		}
	}
	public void addwaterfalls(String fnames)

	{
		System.out.println("added waterfallsnames ".concat(fnames));
		if (counter < waterfallsnames.length) {
			System.out.println("invoke restorent name");
			this.waterfallsnames[counter] = fnames;
			this.counter++;
		} else {
			System.err.println("array full");
		}

	} public void displaywaterfalls() {

		for (int f = 0; f < waterfallsnames.length; f++) {
			String wfname = waterfallsnames[f];
			System.out.println(wfname);
		}
	}
}
