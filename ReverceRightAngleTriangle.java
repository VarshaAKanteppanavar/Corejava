class ReverceRightAngleTriangle{
public static void main(String[] arg){
		int num=Integer.parseInt(arg[0]);
		
		ReverceRightAngleTriangle right=new ReverceRightAngleTriangle();
		right.reverceRightAngleTrangle(num);
		
	}
	
	public void reverceRightAngleTrangle(int num){
		for (int i= num; i>= 1; i--)  
{  
for (int j=num; j>i;j--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  
System.out.print("*");  
}  
System.out.println(""); 
		
	}
	}
}
