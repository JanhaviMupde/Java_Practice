class Demo
{
    public int i;
    static public int j = 21;

    static //static block
    {
        System.out.println("Inside Static block..");
        j=21;
    }

    {
        System.out.println("inside initializer block");
    }

    public Demo()
    {
        System.out.println("Inside constructor..");
        this.i = 11;
    }
    
    public Demo(int a)
    {
        System.out.println("Inside parameterized constructor..");
        this.i = a;
        System.out.println(i);
    }
}

class BlockX
{
    public static void main(String A[])
    {
        System.out.println("Inside main..");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(21);
        System.out.println(dobj4.i);
    }
}