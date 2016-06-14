import java.util.*;
public class Transpose
{
public static void main(String[] args)
{
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt();
	int arr[][]=new int [n][n];
	for (int i=0;i<n ;i++ )
	{
		for (int j=0;j<n ;j++ )
		{
			arr[i][j]=scr.nextInt();			
		}		
	}
	display(arr,n);
	transpose_arr(arr,n);	
}
private static void display(int arr[][],int n)
{
	System.out.println("display Orignal Array");
	for (int i=0;i<n ;i++ )
	{
	for (int j=0;j<n ;j++ )
	{
	System.out.print(arr[i][j]+"\t");		
	}
		System.out.println();	
	}

}
private static void transpose_arr(int arr[][],int n)
{
	System.out.println("display Transpose Array");
	for (int i=0;i<n ;i++ )
	{
	for (int j=0;j<n ;j++ )
	{
	System.out.print(arr[j][i]+"\t");		
	}	
	System.out.println();
	}
	
}
}
