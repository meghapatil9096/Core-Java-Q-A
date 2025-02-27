package demo;
/*    Class And Object    */

class A3 {
    int a=10;
    String b="abc";

    void get() {
        System.out.println(a+" "+b);
    }
}
public class ClassObjectDemo {
    public static void main(String[] args) {
//      creating object of class A3
        A3 obj = new A3();
        obj.get();
    }
}
