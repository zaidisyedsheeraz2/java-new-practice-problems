import java.io.*;

public class index
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter the number of elements\n");
n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
System.out.println("Enter the elements\n");
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Printing array elements\n");
for(int i=0;i<n;i++)
{
System.out.println("Index Position=\t"+i+" "+"Element is="+arr[i]);
}
}
}