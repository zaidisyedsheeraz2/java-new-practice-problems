import java.util.*;
public class Matrix
{
	public static void main(String args[])
	{
	Scanner scr=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	arr[i][j]=scr.nextInt();
	}
	}
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		if(arr[i][j]%2==0)
		{
			System.out.print("\t*");
		}
		else
		{
		System.out.print("\t"+arr[i][j]);
		
		}
        
	}
	System.out.println();
}
}
}
