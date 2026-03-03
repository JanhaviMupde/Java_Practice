
class Base
{
    public void fun() //defination
    {}

    public void gun() //defination
    {}
}

class Derived extends Base
{
    public void run()   // defination
    {}
    public void gun()   //OverRidding
    {}
}

class FinalMethod1
{
    public static void main(String a[])
    {
        Base bobj = new Base();
    }
}