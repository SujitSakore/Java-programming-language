//Create a base class called Shape. This class stores two data values and an abstract member method calArea() that can be used to compute the area of figures. 
//Derive two specific classes Triangle and Rectangle from the base class Shape and display the area of each figure.  


abstract class Shape {
    protected double dimension1;
    protected double dimension2;

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract void computeArea();
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    public void computeArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle Area: " + area);
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void computeArea() {
        double area = dimension1 * dimension2;
        System.out.println("Rectangle Area: " + area);
    }
}

public class Day4_4 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5.0, 4.0);
        Shape rectangle = new Rectangle(6.0, 8.0);
        triangle.computeArea();
        rectangle.computeArea();
    }
}
