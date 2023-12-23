//Create a class called “Time” which has three instance variables - hour, minute and second and also a method name “add” which takes one “Time” object as parameter and
// prints the added value of the calling “Time” object and passed “Time” object. In the main function declare two “Time” objects and assign values using constructor and
//  call the “add” method.

class Time
{
	double hour;
	double minute;
	double second;
	Time(double a,double b,double c)
	{
		hour = a;
		minute = b;
		second = c;
	}
	void add(Time T1)
	{
		hour = hour + T1.hour;
		minute = minute + T1.minute;
		second  = second +T1.second;
		if(second>=60){
		second -= 60;
		minute++;
		}
		if(minute>=60){
		minute-=60;
		hour++;
		}
		if(hour>=24){
		hour %=24;
		}
		System.out.println("hour is :"+hour+"\n"+"minute is :"+minute+"\n"+"secon is :"+second);
	}
}
class Day3_1
{
	public static void main(String args[])
	{
		Time T1 = new Time(1,2,3);
		Time T2 = new Time(1,70,70);
		System.out.println("Time 1 hour :"+T1.hour+"\n"+"Time 1 minute :"+T1.minute+"\n"+"Time 1 second :"+T1.second);
		System.out.println("Time 2 hour :"+T2.hour+"\n"+"Time 2 minute :"+T2.minute+"\n"+"Time 2 second :"+T2.second);
		T2.add(T1);
	}
}
