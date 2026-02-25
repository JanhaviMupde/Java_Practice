import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the Age : ");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("invalid input");
            return;
        }

        if(iNo >= 18) 
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You are underAge");
        }
    }
}