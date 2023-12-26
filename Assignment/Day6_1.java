//Create a class which displays all the command line arguments passed to the program. Also display the length of each argument. 
//Pass atleast 3 arguments. The program should be able to accept any number of arguments.


class Day6_1
{
    public static void main(String args[])
    {
        int l=args.length;
        for(int i=0;i<l;i++)
        {
            System.out.println(args[i]);
            System.out.println("length of argument is :"+args[i].length());
        }
    }
}