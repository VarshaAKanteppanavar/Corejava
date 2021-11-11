package com.xworkz.overriding.aeroplane;

public class Aeroplane {
	private String name;
	private int no;
	private boolean govt;
	
	public Aeroplane() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public boolean isGovt() {
		return govt;
	}

	public void setGovt(boolean govt) {
		this.govt = govt;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Aeroplane) {
				Aeroplane aer=(Aeroplane)obj;
				String checkName=aer.getName();
				int checkNo=aer.getNo();
				Integer cn=Integer.valueOf(checkNo);
				
				if(this.name.equals(checkName) && cn.equals(checkNo))
				{
					System.out.println("matched");
					return true;
				}else {
					System.out.println("not matched");
					return false; 
				}
				
			}else {
				System.out.println("enete correct type");
				return false;
			}
		}
		return false;
	}

}
