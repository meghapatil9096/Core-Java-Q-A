package Inheritance;
    //Multiple Inheritances using Inteface

interface Multi
{
    void show();
}
interface  B2
{
    void display();
}
class MultipleInheritance implements Multi, B2
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
        MultipleInheritance obj=new MultipleInheritance();
        obj.show();
        obj.display();
    }
}
