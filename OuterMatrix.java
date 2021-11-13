class OuterMatrix{
	public static void main(String[] arg){
		int r= Integer.parseInt(arg[0]);
		int c=Integer.parseInt(arg[1]);
		OuterMatrix pattern= new OuterMatrix();
	    pattern.outerPattern(r,c);
	}
	public void outerPattern(int r,int c){
		{
			for(int row=1 ; row<=r;row++)
			{
				for(int col=1;col<=c;col++){
					if(row==1 || row==r||col==1||col==c){
						System.out.print(row+""+col+"\t");
						
					}
					else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
		}
		
	}
}