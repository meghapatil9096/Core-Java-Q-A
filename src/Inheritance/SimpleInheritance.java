package Inheritance;
// Simple - Inheritances

class Student //super class
{
    int rollno, marks;
    String name;
    void inpute()
    {
        System.out.println("Enter roll no, marks and name: ");
    }
}
public class SimpleInheritance extends Student  //sub lass
{
    void display()
    {
        rollno=12;  marks=87;   name="John Doe";
        System.out.println("Roll No: "+rollno);
        System.out.println("Marks: "+marks);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        SimpleInheritance obj = new SimpleInheritance();
        obj.display();
    }
}


