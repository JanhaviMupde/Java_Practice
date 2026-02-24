import java.util.Scanner;

public class p3 
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int a = 0 ;
        
        System.out.println("Enter number :");
        a =sobj.nextInt();

        if(a %2 == 0)
        {
            System.out.println("Number is even..");
        }
        else 
        {
            System.out.println("Number is Odd");
        }

    }        
}
