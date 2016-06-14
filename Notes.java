import java.util.*;
public class Notes 
{
public static void main(String[] args)
{
int amt,val;
Scanner scr=new Scanner(System.in);
amt=scr.nextInt();
val=scr.nextInt();
cal(amt,val);
}
private static void cal(int amt,int val)
{
	int n=0;
	if(amt%val==0)
	{
		n=amt/val;
		System.out.println("Number of notes of value"+val+"is="+n);
	}
	else {
		int rem=amt%val;
		n=amt/val;
		System.out.print("Number of notes of value"+val+"is="+n);	
		val=rem;
		if (val>=100 && val <500) {
			while (val!=0)
			{
						int m=val;
						int x=m/val;
						System.out.print(" And Number of notes of value "+val+"is="+x);	
			}
		
		}
	

	}
}
}