interface Aa
{
    int no = 11;
    void fun();
}

interface B
{
    int no = 21;
    void fun();
}

class Demo implements Aa,B   // Multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun"+Aa.no);    // no generates error
    }
    
}

class InterfaceDemo7
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
    }
}
