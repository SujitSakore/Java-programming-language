// Create two interfaces, 
//The first interface contains
//i)	a data-member called "PI" containing the value 3.141592653589.
//ii)	a method called "volume" to calculate the volume of solids 

//The second interface contains
//iii)	a method called "surfaceArea" to calculate the surface area of solids

//Use the interfaces to calculate the volume and surface area of the following shapes:

//Shape		Volume			Area
//--------------------------------------------------

//Cuboid		height*length*depth	2*height*length +2*height*depth +2*length*depth
//Sphere		(4/3)* pi* radius3	4* pi * radius2
//Rectangle	   ------		a*b


interface I{
        static final double pi=3.141;
        void volume();
   }
   interface A{
        void surfaceArea();
   }
   class Cuboid implements I,A{
        double hei,len,dep;
        Cuboid(double x,double y,double z){
            hei=x;
            len=y;
            dep=z;
     }
    public void volume(){
        double vol=hei*len*dep;
        System.out.println("volume of cuboid is :"+vol);
     }
    public void surfaceArea(){
        double s=2*hei*len+2*hei*dep+2*len*dep;
        System.out.println("surface area is :"+s);
     }
   }
   class Sphere implements I,A{
        double rad;
        Sphere(double a){
            rad=a;
    }
    public void volume(){
        double sph=(4/3)*pi*rad*rad*rad;
        System.out.println("volume of sphere is :" +sph);
    }
    public void surfaceArea(){
        double sa=pi*rad*rad;
        System.out.println("surface area of sphere is :" +sa);
    }
}
class Rectangle implements A{
    int a,b;
    Rectangle(int x,int y){
            a=x;
            b=y;
    }
    public void surfaceArea(){
            int Rc= a*b;
            System.out.println("surfacearea of Rectangle is :" + Rc);
    }
    public void volume(){
            System.out.println("volume is not defined");
     }
        
 }
   
class Day5_2{
    public static void main(String args[]) {
        Cuboid b=new Cuboid(2.0,3.0,4.0);
        b.volume();
        b.surfaceArea();
        Sphere b1=new Sphere(5.0);
        b1.volume();
        b1.surfaceArea();
        Rectangle b2=new Rectangle(2,5);
        b2.volume();
        b2.surfaceArea();
    }
}
