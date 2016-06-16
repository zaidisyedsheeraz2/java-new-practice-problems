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
	int n=0,rem=0;
	if(amt%val==0)
	{
		n=amt/val;
		System.out.println("Number of notes of value"+val+"is="+n);
	}
	else {
		 rem=amt%val;
		 n=amt/val;
		 System.out.println("Number of notes of value"+val+" is="+n);	
		
		while(rem!=0)
		{
			if(rem<1000 && rem>=500)
			{
				n=rem/500;
				rem=rem%500;
				
				//count++;
				System.out.println(" And Number of notes of value 500 is="+n);	
		// 	}
			}
			if(rem<500 && rem>=100)
			{
				n=rem/100;
				rem=rem%100;
				
				//count++;
				System.out.println(" And Number of notes of value 100 is="+n);	
		// 	}
			}
			if (rem>=50 && rem<100)
			{
				n=rem/50;
				rem=rem%50;	
				
				System.out.println(" And Number of notes of value 50 is="+n);
			}
			if (rem>=20 && rem<50)
			{
				n=rem/20;
				rem=rem%20;	
				
				System.out.println(" And Number of notes of value 20 is="+n);
			}
			if (rem>=10 && rem<20)
			{
				n=rem/10;

				rem=rem%10;	
				System.out.println(" And Number of notes of value 10 is="+n);
			}
			if (rem>=5 && rem<10)
			{
				n=rem/5;

				rem=rem%5;	
				System.out.println(" And Number of notes of value 5 is="+n);
			}
			if (rem>=2 && rem<5)
			{
				n=rem/2;

				rem=rem%2;	
				System.out.println(" And Number of notes of value 2 is="+n);
			}
			if (rem>=1 && rem<2)
			{
				n=rem/1;

				rem=rem%1;	
				System.out.println(" And Number of notes of value 1 is="+n);
			}
		}
	

	}
}
}