//Use finally block in the programs
//---------------------------------------------------

//Write a program called “Factorial.java” that computes factorial of a given number x and stores the result in integer type variable for reuse.
// The integer type of variable has its own range. For example factotial 20 is as high as the range of integer type. 
//So check the argument passed and throw an exception if it is too big or too small. If x is less than 0, throw an “IllegalArgumentException” with a message “value of x must be positive”.
// If x is above the length of 10, throw an “IllegalArgumentException” with a message “result will overflow.”


class Factorial extends Exception
{
	String msg;
	void IllegalArgumentException(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}
class Day8_3
{
	public static void main(String args[])
	{
		int x=20;
		try
		{
			if( x < 0)
			{
				throw new IllegalArgumentException("value of x must be positive");
			}
			else if(x > 10)
			{
				throw new IllegalArgumentException("result will overflow");
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
}