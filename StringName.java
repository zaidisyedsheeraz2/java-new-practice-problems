import java.io.*;
public class StringName
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader scr=new BufferedReader(new InputStreamReader(System.in));
		String name=scr.readLine();
		char c,ch;
		int l=name.length();
		c=name.charAt(0);
		int y=name.indexOf(' ');
	 	 ch=name.charAt(y+1);
		int x=name.lastIndexOf(' ');
		String sub=name.substring(x,l);
		String output=c+"."+ch+"."+sub;
		System.out.println(output);

	}		
}