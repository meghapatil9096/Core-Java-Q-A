package polymorphism;
//Run time / Method Overriding Polymorphism

class demo
{
    void m1(int a)
    {
        System.out.println("demo");
    }
}
class demo1
{
    void m1(int a)
    {
        System.out.println("demo1");
    }
}
public class Run_Time_PolyMorphism {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.m1(1);
        demo1 obj1=new demo1();
        obj1.m1(1);
    }
}