//Write a Java program to demonstrate Scanner class. Take appropriate multiline input from keyboard to show the usage of next(), nextLine(), hasNext(), hasNextXXX() 
// and nextXXX() functions where XXX is Int and Float.


import java.util.*;
class Day9_1
{
	public static void main(String args[])
	{
		int a; double b; String c; String d;
		Scanner S = new Scanner(System.in);
		d= S.nextLine();
		System.out.println("Enter the value:"+" & For exit enter end");
		
		while(S.hasNext())
		{
			if(S.hasNextInt())
			{
				a=S.nextInt();
				System.out.println("a:"+a);
			}
			else if(S.hasNextDouble())
			{
				b=S.nextDouble();
				System.out.println("b:"+b);
			}
			else 
			{
				c=S.next();
				System.out.println("c:"+c);
				if(c.equals("end"))
				break;
			}
		}
	}
}
