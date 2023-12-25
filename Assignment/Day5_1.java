//Create an abstract class “ThreeDObject” and derive the classes “Cube”, "Cylinder” from it. The class “ThreeDObject” has one method “volume ()”. 
//Declare this method in each of the derived classes to calculate the volume of each type of three dimensional objects. 
abstract class ThreeDobject{
    abstract void volume();
    double rad;
    ThreeDobject(double x){
        rad=x;
     }
 }
class cube extends ThreeDobject{
cube(double a){
  super(a);
 }
 void volume(){
 double vol=rad*rad*rad;
 System.out.println("volume of cube is : "+ vol);
 }
}
class cylinder extends ThreeDobject{
double hei;
cylinder(double a,double b){
  super(a);
hei=b;
 }
void volume(){
 double vol1= 3.14*rad*rad*hei;
 System.out.println("volume of cylinder is :"+ vol1);
 }
}
class Day5_1{

public static void main(String arg[]){
cube b=new cube(4.0);
b.volume();
cylinder b1= new cylinder(2.0,3.0);
b1.volume();

}
}
