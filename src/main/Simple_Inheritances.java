package main;
// Simple - Inheritances
/*
class Student //super class
{
    int rollno, marks;
    String name;
    void inpute()
    {
        System.out.println("Enter roll no, marks and name: ");
    }
}
public class Simple_Inheritances extends Student  //sub lass
{
    void display()
    {
        rollno=12;  marks=87;   name="John Doe";
        System.out.println("Roll No: "+rollno);
        System.out.println("Marks: "+marks);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Simple_Inheritances obj = new Simple_Inheritances();
        obj.display();
    }
}
*/


// Multilevel Inheritances
/*
class Add //super class
{
    int a,b,c;
    void add()
    {
        a=10;   b=20;
        c=a+b;
        System.out.println("Addition of to number : "+c);
    }
    void sub()
    {
        a=200;   b=20;
        c=a-b;
        System.out.println("Sub of to number : "+c);
    }
}
class B extends Add  //sub1
{
    void multi()
    {
        a=10;   b=20;
        c=a*b;
        System.out.println("Multiplication of to number : "+c);
    }
    void div()
    {
        a=20;   b=20;
        c=a/b;
        System.out.println("Division of to number : "+c);
    }

}

class C extends B  //sub2
{
    void rem()
    {
        a=152;   b=5;
        c=a%b;
        System.out.println("Remaining number : "+c);
    }
}
class Simple_Inheritances extends C
{
    public static void main(String[] args) {
        Simple_Inheritances obj = new Simple_Inheritances();
        obj.add();
        obj.sub();
        obj.div();
        obj.rem();
    }
}
*/


//Multiple Inheritances using Inteface
/*
interface Multi
{
    void show();
}
interface  B
{
    void display();
}
class Simple_Inheritances implements Multi, B
{
    public void show()
    {
        System.out.println("Interface Multi");
    }

    @Override
    public void display() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        Simple_Inheritances obj=new Simple_Inheritances();
        obj.show();
        obj.display();
    }
}
*/


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

class Simple_Inheritances
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