import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iStd = 0;

        System.out.println("Enter the Standerd : ");
        iStd = sobj.nextInt();

        if(iStd == 1)
        {
            System.out.println("Exam at 9");
        }
        else if(iStd == 2)
        {
            System.out.println("Exam at 10");
        }
        else if(iStd == 3)
        {
            System.out.println("Exam at 11");
        }
        else if(iStd == 4)
        {
            System.out.println("Exam at 12 noon");
        }
        else
        {
            System.out.println("invalid class");
        }
        
    }
}