import java.util.*;
public class CharacterOccourance
{
	public static void frequency(String a)
	{
		int count=0;
		char arr[]=a.toCharArray();
		// for (int i=0;i<a.length() ;i++ )
		// {
		// 	char c=a.charAt(i);
		// 	for (int j=a.length()-1;j>i ;j-- )
		// 	{
		// 		char ch=a.charAt(j);
		// 		if(c==ch)
		// 		{
		// 			count++;
		// 		}		
		// 	}
		// 	System.out.println("Character\t"+c+" occource\t"+count+"times");	
		// }
		int flash=0;
		Arrays.sort(arr);
		for (int i=0;i<arr.length ;i++ )
		{
			// if (arr[i]==arr[i-1])
			// {
			// 	count++;
			// }
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]==arr[j])
				{
					
						count++;
				}	

			}
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
					flash=1;
			}

			if(flash==0 && arr[i]!=32)
				System.out.println("Character\t"+arr[i]+" occource\t"+(count+1)+"times");
		count=0;	
		flash=0;
		}

		
	}
public static void main(String[] args)
{
	String a;
	Scanner scr=new Scanner(System.in);
	a=scr.nextLine();
	frequency(a);
}	
}