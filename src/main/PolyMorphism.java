package main;

// Complie time / Method Overloading Ploymorphism Example

//public class PolyMorphism {
//    void m1()
//    {
//        System.out.println("Without arguments");
//    }
//    void  m2(int id)
//    {
//        System.out.println("With arguments");
//
//    }
//    void m3(String name)
//    {
//        System.out.println("String argument ");
//    }
//    public static void main(String[] args) {
//        PolyMorphism p=new PolyMorphism();
//        p.m1();
//        p.m2(1);
//        p.m3("John");
//    }
//}




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
public class PolyMorphism {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.m1(1);
        demo1 obj1=new demo1();
        obj1.m1(1);
    }
}