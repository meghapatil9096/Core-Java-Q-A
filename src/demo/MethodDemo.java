package demo;

class A
{
    void printDetails(int RollNo, String Name)
    {
        System.out.println("RollNo: "+RollNo);
        System.out.println("Name: "+Name);
    }

    static void Add()
    {
        int a=10,b=20;
        System.out.println("Sum of a and b is "+ (a+b));
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        A a = new A();
        a.printDetails(1,"Hardik");
// we can call static method directly with class name without object
        A.Add();
    }
}
