//Write a Java program to demonstrate the use of InputStreamReader Class. Take input from keyboard till a terminating condition appears. Display the input to the console. 


import java.io.*;
class Day9_2
{
	public static void main(String args[]) throws IOException
	{
		char c;
		InputStreamReader b=new InputStreamReader(System.in);
		do
		{
			c=(char)b.read();
			System.out.println(c);
		}while('c'!='z');
	}
}
