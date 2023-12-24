//Create a super class called Figure that stores the dimension of 2-dimensional objects. It defines a method called area() that returns area in type double.
// Since no area of Figure is there, it prints “Area undefined” and returns 0(zero). Derive 2 subclasses Rectangle and Triangle from Figure.
//  Each of these subclasses overrides area() to return area of Rectangle and Triangle respectively. Create objects of all these classes and call the area() method.
//   Create a reference variable of class Figure and assign the objects of 2 subclasses to it and call the area method().


class Figure
{
    private double length , breadth;
    double area()
    {
        double ar=length*breadth;
        System.out.println("Area undefined!!");
        return 0;
    }
}
class Rectangle extends Figure
{
    private double l, b;
    Rectangle(double m ,double n)
    {
        l=m;b=n;
    }
    double area()
    {
        double ar=l*b;
        System.out.println("Area:");
        return ar;
    }
}
class Triangle extends Figure
{
    private double l, b;
    Triangle(double m , double n)
    {
        l=m;b=n;
    }
    double area()
    {
        double ar=0.5*l*b;
        System.out.println("Area:");
        return ar;
    }
}
class Day4_2
{
    public static void main(String args[])
    {
        Figure F1 = new Figure();
        Figure F2 = new Figure();
        Rectangle R1 = new Rectangle(5.0,6.0);
        Triangle T1 = new Triangle(4.0,6.0);

        System.out.println(F1.area()) ;
        System.out.println(R1.area()) ; 
        System.out.println(T1.area()) ;
        F2=R1;
        System.out.println(F2.area()) ;
        F2=T1;
        System.out.println(F2.area()) ;
    }

}
