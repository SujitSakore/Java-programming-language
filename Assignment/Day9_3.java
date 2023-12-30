//Write a Java program that takes multiple lines of text containing multiple words from keyboard and display the text. Continue till "stop" word is entered.


import java.io.*;
class Day9_3
{
	public static void main(String args[])throws IOException
	{
		String a;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			a=b.readLine();
			System.out.println(a);
		}
		while(!a.equals("stop"));
	}
}