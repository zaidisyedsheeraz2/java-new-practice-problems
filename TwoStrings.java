import java.io.*;

	public class TwoStrings
		{
			private static void compare(String str,String str1)
				{
					char a[]=str.toCharArray();
					char b[]=str1.toCharArray();
					int yc=0;
					for(int i=0;i<a.length;i++)
						{
						for(int j=b.length-1;j>=i;j--)
							{
								if(a[i]==b[j])
									{
										
										yc++;
										break;
									}
							}
						}
					if(yc>0)
					{
					System.out.println("YES");
					}
					else
					{
					System.out.println("NO");
					}
				}
			public static void main(String args[])throws IOException
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					int t=Integer.parseInt(br.readLine());
					while(t>0)
						{
							String s,s1;
							s=br.readLine();
							s1=br.readLine();
							compare(s,s1);
							t--;
						}
				}
		}
			
	