//Create a package mycomplex containing a class Complex. This class contains a constructor to initialize a complex number and one method add() to return sum of two complex numbers.
//Write a Java program that can import the class of the above package and use the above mentioned method.


package mycomplex;
public class complex
 {
   int rea,ima;
   public complex(int x, int y)
    {
      rea=x;
      ima= y;
    }
 public complex add(complex C)
    {
      complex c= new complex();
      c.rea = rea+C.rea;
      c.ima = ima+C.ima;
      return c;
    }
   public complex(){}
   public void show(){
   System.out.println(rea +"i"+ima);
   } 
 }


//*

import mycomplex.complex;
class test
 {
  public static void main(String arg[])
   {
     complex C = new complex(3,5);
     complex c1 = new complex(4,6);
    complex c2 =c1.add(C);
    c2.show();
   }
 }
