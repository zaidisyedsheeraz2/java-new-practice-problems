import java.util.*;

public class Palindrome
{
	public static void main(String args[])
	{
	String a,rev="";
	Scanner scr=new Scanner(System.in);
	a=scr.nextLine();
	for (int i=a.length()-1;i>=0 ;i-- ) {
		rev=rev+a.charAt(i);
	}
	//System.out.println(rev);	
	if(a.equals(rev))
	{
	System.out.println("Palindrome");
	}
	else
	{
	System.out.println("Not Palindrome");
	}
	}
}