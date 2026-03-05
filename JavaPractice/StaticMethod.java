class Demo
{
    public int i;   //Instance variable
    static public int j = 21;   //class variable

    public Demo()
    {
        this.i = 11;
    }

    public void fun()
    {
        System.out.println("fun i : "+this.i);
        
        System.out.println("fun j : "+Demo.j);
    }

    
    public static void gun()
    {
       // System.out.println("gun i : "+this.i);
        
        System.out.println("gun j : "+Demo.j);
    }
}

class StaticMethod
{
    public static void main(String A[])
    {
        Demo.gun();

        System.out.println(Demo.j);

        Demo dobj = new Demo();
        System.out.println(dobj.i);
        dobj.fun();
    }
}