//Create a class which creates a new string after concatenating all the command line arguments given by user. Display the final string and its length . Pass atleast 4 arguments.
// The program should be able to accept any number of arguments.


class Day6_2
{
    public static void main(String args[])
    {
        int l=args.length;
        String C=new String();
        for(int i=0;i<l;i++)
        {
            C=C+args[i];
        }
        System.out.println(C);
        System.out.println("length of new string is :" +C.length());
    }
}
