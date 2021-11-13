class PlusMatrix{
	public static void main (String[] arg)
	{
	  
		PlusMatrix pattern= new PlusMatrix();
	    pattern.plusMatrix(5,5);
	}
	public void plusMatrix(int r,int c){
		if (r%2!=0 && c%2!=0)
		{int mid=(r/2)+1;
	System.out.println("\n");
	for(int row=1 ; row<=r;row++)
			{
				for(int col=1;col<=c;col++){
					if(row==mid||col==mid){
						System.out.print(row+""+col+"\t");
					}
					else{
						System.out.print("\t");
					}
					}
					System.out.println();
				}
	}
	}
}


