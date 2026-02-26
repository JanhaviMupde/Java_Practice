class Base //8 byte
{
    public int i,j;

    public void fun()
    {
        System.out.println("inside Base fun");
    }
}

class Derived extends Base //12 bytes
{
    public int x;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }
}


class Single
{
    public static void main(String A[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();

        dobj.fun();
        bobj.fun();

        dobj.gun();

    }
}