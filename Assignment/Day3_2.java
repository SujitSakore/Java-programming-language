//Define a class Shape and then find out the volume of a cube, cylinder and sphere using method overloading      
//          (Volume:   Cube: lenght*breadth*height
//            	     Sphere: PI*radius*radius*radius
//	             Cylinder: PI*radius*radius*height )

class Shape
{

    float volume(int a)
    {
       return a*a*a;
    }
    float volume(int a,float PI)
    {
       return (PI*a*a*a);
    }
    float volume(int a,float PI,int b)
    {
       return (PI*a*a*b);
    }
}

public class Day3_2
{
    public static void main(String args[])
    {
        Shape Cube = new Shape();
        Shape sphere = new Shape();
        Shape Cylinder = new Shape();

        System.out.println( Cube.volume(4));
        System.out.println(sphere.volume(5,3.14f));
        System.out.println( Cylinder.volume(6,3.14f,6));
       
    }
}
