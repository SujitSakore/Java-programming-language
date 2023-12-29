//Use finally block in the programs
//---------------------------------------------------

//Create one user defined exceptions TooHot. Write a Java program that throws TooHot if the temperature exceeds 40 degrees with proper message. 


class TooHot extends Exception
{
	String s;
	TooHot(String a)
	{
		s=a;
	}
	public String toString()
	{
		return s;
	}
}
class Day8_2
{
	public static void main(String args[])
	{
		int temp=45;
		try
		{
			if(temp>40){
			throw new TooHot("Temperature is above 40");
			}
		}
		catch(TooHot e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}


