package polymorphism;

// Complie time / Method Overloading Ploymorphism Example

public class Compile_Time_PolyMorphism {
    void m1()
    {
        System.out.println("Without arguments");
    }
    void  m2(int id)
    {
        System.out.println("With arguments");

    }
    void m3(String name)
    {
        System.out.println("String argument ");
    }
    public static void main(String[] args) {
        Compile_Time_PolyMorphism p=new Compile_Time_PolyMorphism();
        p.m1();
        p.m2(1);
        p.m3("John");
    }
}




