class RightAngleTriangle
{
	public static void main(String[] arg){
		int num=Integer.parseInt(arg[0]);
		
		RightAngleTriangle right=new RightAngleTriangle();
		right.rightAngleTrangle(num);
		
	}
	public void rightAngleTrangle(int num){
		for(int i=0; i<num; i++)   
{   
for(int j=0; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println();
	}
}
}
