//Create a class called Complex to create complex number objects. Write methods in the Complex class to do the following:
//	i)  add two complex numbers 
//    	ii)  subtract two complex numbers


class Complex{
    int real ,img;
    Complex(){}
    public Complex (int a,int b){
        real=a;
        img=b;
    }
    void add(Complex b1,Complex b2){
        real=b1.real+b2.real;
        img=b1.img+b2.img;
        System.out.println("sum of complex:"+real +"+"+"i" + img);
    }
    void sub(Complex b1,Complex b2){
        real=b1.real-b2.real;
        img=b1.img-b2.img;
        System.out.println("sub of complex:"+real +"-"+"i" +img);
    }

}
    
class Day1_1{
    public static void main(String args[]){
        Complex b1 = new Complex(3,5);
        Complex b2 = new Complex(5,2);
        Complex b3 = new Complex();
        b3.add(b1,b2);
        b3.sub(b1,b2);
    }
}