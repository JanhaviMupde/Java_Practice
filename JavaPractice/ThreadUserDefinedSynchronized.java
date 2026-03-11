class TablePrinter
{
    public void TablePrinter(int n)
    {
        int i = 0;
        for(i=1; i<=10; i++)
        {
            System.out.println("Name :"+Thread.currentThread().getName()+" : "+(n*i));
        }
    }
}
class Demo extends Thread
{
    public void run() 
    {

    }
}

public class ThreadUserDefinedSynchronized
{
    public static void main(String A[])
    {
        TablePrinter tobj = new TablePrinter();
        tobj.TablePrinter(5);
        tobj.TablePrinter(10);
    }    
}
