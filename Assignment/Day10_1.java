//Write a Java program which takes the name of a file from keyboard and then display the content of file on the screen. 
//The program should use the concept of Character Stream.


import java.util.*;
import java.io.*;
class Day10_1 {
	public static void main(String args[])throws IOException 
	{
		Scanner s1=new Scanner(System.in);
		String s2=s1.next();
		FileReader F1=new FileReader(s2);
		int i;
		do
		{
			i=F1.read();
			System.out.print((char)i);
		}while (i!=-1);
	}
}
