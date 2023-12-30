//Write a Java program which takes the name of two files as command line argument and then copy the content of one file to the other file.
// The program should use Byte Stream.


import java.io.*;
class Day10_2
{
	public static void main(String args[]) throws IOException
	{
		RandomAccessFile R1= new RandomAccessFile(args[0],"rw");
		RandomAccessFile R2= new RandomAccessFile(args[1],"rw");
		int i;
		String S1=new String();
		do
		{
			i=R1.read();
			S1=S1+(char)i;
		}while(i!=-1);
		R2.writeUTF(S1);
	}
}
