package com.xworkz.application;

public class ApplicationDAO {
	private ApplicationDTO[] applicationDTO = new ApplicationDTO[10];
	private FacebookApplicationDTO[] facebookDTO = new FacebookApplicationDTO[5];
	private InstagramApplicationDTO[] instagramDTO = new InstagramApplicationDTO[5];
	int count = 0;

	public void save(ApplicationDTO data) {
		if (this.count < this.applicationDTO.length && data != null) {
			this.applicationDTO[count++] = data;
			System.out.println("Save : ".concat(data.getName()));
			System.out.println("Save : ".concat(data.getVerasion()));
			System.out.println("save : ".concat(data.getCompany()));
			System.out.println("save : ".concat(data.getFounder()));

		} else {
			System.out.println("The index is not correct");
		}
	}

	public void saveFacebookDTO(FacebookApplicationDTO face) {
		if (this.count < this.facebookDTO.length && face != null) {
			this.facebookDTO[count++] = face;
			System.out.println("save : ".concat(face.getCeoName()));
			System.out.println("save : ".concat(face.getHeadQuarter()));

		} else {
			System.out.println("The index is wrong in FacebookApplication");
		}
	}

	public void saveInstagaramDTO(InstagramApplicationDTO insta) {
		if (this.count < this.instagramDTO.length && insta != null) {
			this.instagramDTO[count++] = insta;
			System.out.println("save : ".concat(insta.getServerLocation()));
			System.out.println("save : ".concat(String.valueOf(insta.getTotalUsers())));
		} else {
			System.out.println("invoked index is not correct in instagaramDTO");
		}
	}

	public void displayAllApplicationDTO() {
		for (int i = 0; i < applicationDTO.length; i++) {
			ApplicationDTO ref = applicationDTO[i];
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getCompany());
				System.out.println(ref.getFounder());
				System.out.println(ref.getVerasion());
			}
		}
	}

	public void facebookDisplay() {
		for (int i = 0; i < facebookDTO.length; i++) {
			FacebookApplicationDTO ref = facebookDTO[i];
			if (ref != null) {
				System.out.println(ref.getCeoName());
				System.out.println(ref.getHeadQuarter());
			}
		}
	}
	public void instagaramDisplay() {
		for(int i=0; i<instagramDTO.length;i++) {
			InstagramApplicationDTO ref=instagramDTO[i];
			if(ref!=null) {
				System.out.println(ref.getServerLocation());
				System.out.println(ref.getTotalUsers());
			}
			}
	}

}
