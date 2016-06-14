import java.util.*;
	public class ArrayNew
		{
			public static void main(String args[])
				{
					Scanner scr=new Scanner(System.in);
					int n=scr.nextInt();
					int arr[]=new int[n];
					for(int i=0;i<n;i++)
					{
					System.out.println("Enter the"+(i+1)+"Number");
					arr[i]=scr.nextInt();
					}
					System.out.println("Press 1 for print , Press 0 to exit & Press 2 for re-enter");
					int ch=scr.nextInt();
					if(ch==1)
					{
					for(int i=0;i<n;i++)
					{
					System.out.print("\t"+arr[i]);
					}
					}
					else if(ch==0)
					{
					System.out.println("Thanks");
					}
					if(ch==2)
					{
						//arr[]=0;
						System.out.println("Re-enter Array");
						for(int i=0;i<n;i++)
						{
							arr[i]=scr.nextInt();
						}
						for(int i=0;i<n;i++
)						{
						System.out.print("\t"+arr[i]);
						}
					}
				}
		}