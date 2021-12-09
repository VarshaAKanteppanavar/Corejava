package com.xworkz.dp.dto;

public class CircusDTO {
	 private String owner;
     private float ticketPrice;
     private int numberOfAnimals;
     private int numberOfShows;
     private int durationInHour;
     
     public CircusDTO() {
			System.out.println("Invoking CircusDTO constructor");
		}

		public CircusDTO(String owner, float ticketPrice, int numberOfAnimals, int numberOfShows, int durationInHour) {
			super();
			this.owner = owner;
			this.ticketPrice = ticketPrice;
			this.numberOfAnimals = numberOfAnimals;
			this.numberOfShows = numberOfShows;
			this.durationInHour = durationInHour;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public float getTicketPrice() {
			return ticketPrice;
		}

		public void setTicketPrice(float ticketPrice) {
			this.ticketPrice = ticketPrice;
		}

		public int getNumberOfAnimals() {
			return numberOfAnimals;
		}

		public void setNumberOfAnimals(int numberOfAnimals) {
			this.numberOfAnimals = numberOfAnimals;
		}

		public int getNumberOfShows() {
			return numberOfShows;
		}

		public void setNumberOfShows(int numberOfShows) {
			this.numberOfShows = numberOfShows;
		}

		public int getDurationInHour() {
			return durationInHour;
		}

		public void setDurationInHour(int durationInHour) {
			this.durationInHour = durationInHour;
		}
     
     
	


}
