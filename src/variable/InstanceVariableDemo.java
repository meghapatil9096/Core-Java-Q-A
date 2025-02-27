package variable;
class A2
{
//  Instance Variable
    int a=23,b=12;
    void put()
    {
        int temp=a+b;   //Local Variable
        System.out.println("Sum of two number is "+temp);
    }
}
public class InstanceVariableDemo {
    public static void main(String[] args) {
        A2 a=new A2();
        a.put();
        System.out.println(a.a);
    }
}
