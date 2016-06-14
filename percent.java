import java.io.*;

public class percent
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter the number of subjects\n");
n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
System.out.println("Enter the marks\n");
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(br.readLine());
}
double total=0;
double percent;
for(int i=0;i<n;i++)
{
total=total+arr[i];
}
System.out.println("Total Marks="+total);
percent=total/n;
System.out.println("Percentage Marks="+percent);
if(percent>=60)
{
System.out.println("Division= 1st");
}
if(percent>45 && percent<60)
{
System.out.println("Division= 2nd");
}
if(percent<45)
{
System.out.println("Fail");
}
}
}