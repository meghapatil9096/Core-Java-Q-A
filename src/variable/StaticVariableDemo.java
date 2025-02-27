package variable;
class A1
{
//  Static varaible
    static int  a=23;
    void put()
    {
        int b=12;;
        System.out.println(a+" "+b);
        ++a;    ++b;
    }
}
public class StaticVariableDemo {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.put();
        System.out.println(A1.a); //Static variable access directly by the class name

        obj.put();
    }
}
