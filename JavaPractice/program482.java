//accept string and replace white spaces 25th july 
import java.util.*;

class StringX
{
    public String Replace(String str, char A, char B)
    {
        int i = 0;
        char Arr[] = str.toCharArray(); //changes

        for(i = 0; i<Arr.length; i++)//lentgh is property now
        {
            if(Arr[i] == A)
            {
                Arr[i] = B;
            }
        }
        
        String newstr = new String(Arr);
        return newstr;

    }
}

class program482
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.Replace(str,' ', '_' );
        
        System.out.println("new string is :"+sRet);
    }
}
//this is better


