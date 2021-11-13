class HalfPlusMatrix{
public static void main(String[] arg)
{
	int r=Integer.parseInt(arg[0]);
	int c=Integer.parseInt(arg[1]);
	HalfPlusMatrix halfplus=new HalfPlusMatrix();
	halfplus.halfPlusMatrix(r,c);
}
	public void halfPlusMatrix(int r,int c){
		if (r%2!=0 && c%2!=0)
		{int mid=(r/2)+1;
	System.out.println("\n");
	for(int row=1 ; row<=r;row++)
			{
				for(int col=1;col<=c;col++){
					if(row==mid &&  col!=c-1 && col!=c || col==mid &&row!=r-1 && row!=r ){
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