//accept string and count white spaces 25th july 
import java.util.*;
class program480
{
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string : ");
        String str = sobj.nextLine();

        int i = 0, iCount = 0;
        char Arr[] = str.toCharArray(); //changes

        for(i = 0; i<Arr.length; i++)//lentgh is property now
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("number of white spaces are : "+iCount);
    }

}
//this is better


