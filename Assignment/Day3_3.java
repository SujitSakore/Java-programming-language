//Declare all variables as private
//1. Write a program which will create a class 'Box', with the following properties:
//	a.	integer type of width, height and depth of Box 
//	b.	overload constructors with appropriate messages
//	c.	method show() to display width, height & depth  
//Create another derived class named as 'BoxWeight from 'Box', with the following properties:
//	a.	extra property like weight of Box.
//	b.	create objects of BoxWeight class using constructor overloading (with appropriate messages)
//	c.	method to display all the four instance variables.

class Box
{
    private int width,height,depth;
   
    Box(int a, int b, int c)
    {
        width =a ; height = b; depth = c;
    }
    void show()
    {
        System.out.println(width+"\n"+height+"\n"+depth);
    }
}
class BoxWeight extends Box
{
    private int weight;
    BoxWeight(int a , int b, int c ,int d)
    {
        super(a,b,c);
        weight =7;
    }
    void show()
    {
        super.show();
        System.out.println(weight);
    }
}
class Day3_3 
{
    public static void main(String args[])
    {
        
        BoxWeight C1 = new BoxWeight(4,5,6,7);
        C1.show();
    }
}
