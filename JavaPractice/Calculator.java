import java.util.*;

public class Calculator 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int a,b=0;

        System.out.println("Enter 1st Number : ");
        a = sobj.nextInt();
        System.out.println("Enter 2nd Number : ");
        b = sobj.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        int n = 0;
        System.out.println("Enter the operation : ");
        n = sobj.nextInt();

        if(n == 1)
        {
            System.out.println("Performing Addition..");
            System.out.println("Addition is : "+ (a+b));
        }
        else if(n == 2)
        {
            System.out.println("Performing Subtraction..");
            System.out.println("Subtraction is : "+ (a-b));
        }
        else if(n==3)
        {
            System.out.println("Performing Multiplication..");
            System.out.println("Multiplication is : "+ (a*b));
        }
        else if(n==4)
        {
            System.out.println("Performing Division..");
            System.out.println("Division is : "+ (a/b));
        }

    }
}
