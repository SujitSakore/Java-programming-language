//Write a program to create a class named “Vehicle” having instance variables licence_number, speed, color, owner_name and a method “showdata()” to show “This is a vehicle class”.
 //Inherit the Vehicle class and create two subclasses named “Bus” and “Car” having individual private instance variable route_no in “Bus” and manufacturer_name in “Car” and both of them
  //overriding “showdata()” method showing all details of bus and car respectively with content of the super class’s “showdata()” method. Call showdata() method of 2 subclasses
   //with the help of a super class reference variable.

class Vehicle
{
    private int licence_number, speed;
    private String color, owner_name;

    Vehicle(int a, int b, String c ,String d)
    {
        licence_number=a; speed=b; color=c; owner_name=d;
    }

    void showdata()
    {
        System.out.println("licence_number:"+ licence_number +"\nspeed:"+ speed+"\ncolor:"+ color+"\nowner_name:"+ owner_name);
    }
}
class Bus extends Vehicle
{
    private int route_no;

    Bus(int a, int b, String c ,String d,int e)
    {
        super(a,b,c,d);
        route_no=e;
    }

    void showdata()
    {
        super.showdata();
        System.out.println("route_no:"+route_no+"\n");
    }

}
class Car1 extends Vehicle
{
    Car1(int a, int b, String c ,String d,String e)
    {
        super(a,b,c,d);
        manufacturer_name=e;
    }
    private String manufacturer_name;
    void showdata()
    {
        super.showdata();
        System.out.println("manufacturer_name:"+manufacturer_name);
    }
}

class Day4_3
{
    public static void main(String args[])
    {
        Vehicle V1;
        Bus B1 = new Bus(2264,200,"black" ,"Abc",2);
        Car1 C1 = new Car1(2264,200,"black" ,"Abc","Tata");

        V1=B1;
        V1.showdata();
        V1=C1;
        V1.showdata();

    }
}
