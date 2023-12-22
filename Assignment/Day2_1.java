//1.Create a class called Complex with constructor overloading to create complex number objects. Write methods in the Complex class to do the following:
//	i)	add two complex numbers (pass Complex as parameter) and return the result to main
//	ii)	subtract two complex numbers (pass two Complex number as parameter) and return the result to main

class Complex
{
    int a ,b;
    Complex()
    {
        a=11;b=0;
    }
    Complex(int l)
    {
        a=10;b=l;
    }
    String add(Complex C2)
    {
        a = a + C2.a;
        b = b + C2.b;

        return (a+"+ i"+b);
    }

    String subtract(Complex C2)
    {
        a = a - C2.a;
        b = b - C2.b;

        return (a+"+ i"+b);
     
    }
}

class Day2_1
{
    public static void main(String args[])
    {
        Complex C1 = new Complex();
        Complex C2 = new Complex(5);
        System.out.println(C1.add(C2));
        System.out.println(C1.subtract(C2));

    }
}
