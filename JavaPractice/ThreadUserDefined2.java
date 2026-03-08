class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method..");
    }
}

public class ThreadUserDefined2
{
    public static void main(String A[])
    {
        System.out.println("Iniside main thread..");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();
        dobj2.start();

        System.out.println("End of main thread");
    }    
}
