class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method of "+Thread.currentThread().getName());
        
    }
}

public class ThreadUserDefinedJoinX
{
    public static void main(String A[]) throws InterruptedException
    {
        System.out.println("Iniside main thread..");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of main thread");
    }    
}
