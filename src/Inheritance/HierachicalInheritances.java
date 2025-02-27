package Inheritance;

//Hierarchical Inheritanes
class Add
{
    int a,b,c;
    void add()
    {
        System.out.print("Answer is : ");
    }
}
class B extends Add
{
    void multi()
    {
        a=12; b=21;
        c=a*b;
        System.out.print(c+"\n");
    }
}
class C extends Add
{
    void sub()
    {
        a=200; b=100;
        c=a-b;
        System.out.print(c);
    }
}

class HierachicalInheritances
{
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        b.add();
        b.multi();
        c.add();
        c.sub();
    }
}