//Write a program to create a class "Car" having a method vehicleType(). Create another class "Maruti" from Car which has two methods brand() and maxSpeed().
//Create the third class "Maruti800" from Maruti. This class has a method maxSpeed(). Create object of each class and call the methods.


 class Car
{
    void vehicleType(){}
}
class Maruti extends Car
{
    void brand()
    {
        System.out.println("Maruti");
    }
    void maxSpeed()
    {
        System.out.println("200km/hr");
    }
}
class Maruti800 extends Car
{
    void maxSpeed()
    {
        System.out.println("240km/hr");
    }
}
class Day4_1 
{
    public static void main(String args[])
    {
        Car C1 = new Car();
        Maruti M1 = new Maruti();
        Maruti800 N1 = new Maruti800();

        M1.brand();
        M1.maxSpeed();
        N1.maxSpeed();
    }
}
