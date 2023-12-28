//Create a package myvehicle containing a class named “vehicle” having instance variables Licence_number, speed, color, 
//owner_name and a method “showdata()”. Create another package mybus which inherits the vehicle class named “Bus” having
//individual private instance variable route_no and  “showdata()” method showing all details of bus with content of the super //class’s “showdata()” method. This program takes input through constructor.


package myvehicle;
public class vehicle
{
	private int li_nu,speed;
	private String colour,ow_name;
	public vehicle(int x,int y,String a, String b)
	{
		li_nu=x;
		speed=y;
		colour=a;
		ow_name=b;
	}
	public void showdata()
	{
		System.out.println("li_nu:"+li_nu+"\nspeed:"+speed+"\ncolour:"+colour+"\now_name:"+ow_name);
	}
}


//*

package mybus;
public class bus extends myvehicle.vehicle
{
	private int rout_no;
	public bus(int x,int y,String a,String b,int c)
	{
		super(x,y,a,b);
		rout_no =c;
	}
	public void showdata(){
		super.showdata();
		System.out.println("rout_no:"+rout_no);
	}
}


//*

import myvehicle.vehicle;
import mybus.bus;
public class Day8_2{
	public static void main(String args[]){
		bus b = new bus(300,50,"GRAY","SUJIT",6);
		b.showdata();
	}
}		
