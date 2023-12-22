//a. Create a class called “Box” which contains three variables – width, height and length. Set the values of the variables using constructor overloading.
//     Class also contains one method “volume” which returns the volume of the box. From main function call the volume function of the class and print the volume.
//b. Write a method called “equals” in the “Box” class. “equals” method takes one parameter of type Box. Use this function to check whether volume of two boxes are equal or not.


class Box
{
    int width,height,length;

    Box()
    {
        width=10;height=12;length=5;
    }
    Box(int a, int b, int c)
    {
        width=a;height=b;length=c;
    }
    int volume()
    {
        return length*width*height;
    }
    boolean equals(Box B2)
    {
        if(volume()==B2.volume())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class Day2_2
{
    public static void main(String args[])
    {
        Box B1 = new Box();
        Box B2 = new Box(4,6,8);
        System.out.println(B1.volume());
        System.out.println(B2.volume());

        if(B1.equals(B2))
        {
            System.out.println("Equal volume");
        }
        else
        {
            System.out.println("NOt equal");
        }
    }
}
