import java.io.*;
public class Pattern
{
	public static void main(String[] args)throws IOException
	{
	
		for (int i=1;i<=9 ;i=i+2 )
		 {
		 	//System.out.print(" ")
		 	for (int k=8;k>=i ;k=k-2)
		 	 {	
		 			System.out.print("   ");
		 		}	
		 	for (int j=1;j<=i ;j++ )
		 	{
		 		System.out.print(" * ");	
		 	}
		 	System.out.println();
			}	
			for (int i=7;i>=1 ;i=i-2 )
		 {
		 	for (int k=i;k<=7 ;k=k+2)
		 	 {	
		 			System.out.print("   ");
		 		}	
		 	for (int j=i;j>=1 ;j-- )
		 	{
		 		System.out.print(" * ");	
		 	}
		 	System.out.println();
			}
	}
}
