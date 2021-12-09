package com.xworkz.application;

public class ApplicationExecuter {

	public static void main(String[] args) {
		ApplicationDTO app=new ApplicationDTO("instagram", "210.0.0.28.71", "facebook", "kevin");
		ApplicationDTO app1=new ApplicationDTO("Meta", "343.0.0.13.117", "facebook", "mark");
		ApplicationDTO app2=new ApplicationDTO("Snapchat", "11.51.1.37", "Snap Inc", "Even") ;
		FacebookApplicationDTO face=new FacebookApplicationDTO("Mark", "california");
		InstagramApplicationDTO insta= new InstagramApplicationDTO(1.386f, "India");
		ApplicationDAO application=new ApplicationDAO();
		application.save(app);
		application.save(app1);
		application.save(app2);
		application.saveFacebookDTO(face);
		application.saveInstagaramDTO(insta);
		System.out.println();
		System.out.println();
		                    
		application.displayAllApplicationDTO();
		System.out.println();
		application.facebookDisplay();
		System.out.println();
		application.instagaramDisplay();
		System.out.println();
		application.facebookDisplay();
		System.out.println();
		application.instagaramDisplay();
		
		

	}

}
