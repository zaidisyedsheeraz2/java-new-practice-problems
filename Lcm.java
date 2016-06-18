import java.util.*;
public class Lcm
  {
	public static void main(String[] args)
	 {
		int a,b,lcm=1;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter first number\n");
		a=scr.nextInt();
		System.out.println("Enter second number\n");
		b=scr.nextInt();
		if (a>b) 
		{
			if (a%b!=0)
			 {
				for (int i=2;i<a ;i++ ) {
			 		if (a%i==0) {
			 			lcm=(a/i)*b;
			 		}
			 		else {
			 			
						lcm=a*b;
			 		}
			 	}
			}
			if (a%b==0)
			 {
				
				lcm=a;
			}
		}
		else if (b>a)
		 {
		 	if (b%a!=0)
			 {
			 	for (int i=2;i<b ;i++ ) {
			 		if (b%i==0) {
			 			lcm=(b/i)*a;
			 		}
			 		else {
			 			
						lcm=b*a;
			 		}
			 	}
				
			}
			if (b%a==0)
			 {
				
				lcm=b;
			}	
		}
	System.out.println("\n Lcm of two numbers "+a+" and "+b+" is "+lcm); 
			
	}

}