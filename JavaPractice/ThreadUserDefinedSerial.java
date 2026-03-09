class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method of "+Thread.currentThread().getName());
        
    }
}

public class ThreadUserDefinedSerial
{
    public static void main(String A[])
    {
        System.out.println("Iniside main thread..");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        //Checked Exception
        try         
        {
            dobj1.start();
            dobj1.join();
            System.out.println("End if first thread");
        
            dobj2.start();
            dobj2.join();
            System.out.println("end of second thread..");
        
        }
        catch(InterruptedException iobj)
        {

        }

        System.out.println("End of main thread");
    }    
}
