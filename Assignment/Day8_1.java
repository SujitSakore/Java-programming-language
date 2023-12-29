//Use finally block in the programs
//---------------------------------------------------

//1. Write a Java program to demonstrate ArrayIndexOutOfBoundsException, ArithmeticException exceptions (use multiple catch blocks). 


class Day8_1
{
	public static void main(String args[])
	{
		int n=10,d=0;
		try{
			int f=n/d;
			int c[]={3};
			c[2]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("inside ALOOB Exception"+e);
		}
		finally
		{
			System.out.println("Final");
		}
	}
}
