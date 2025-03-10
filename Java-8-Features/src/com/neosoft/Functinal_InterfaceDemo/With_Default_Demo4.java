package com.neosoft.Functinal_InterfaceDemo;
interface  MyFunctionInterface{
//    Abstract Method ( only one abstract method is Allowed)
    void display(String msg);

//    Default method   (can have multiple default method)
    default  void showMsg()
    {
        System.out.println("This is Default method in Functional Interface");
    }

//    Static method    ( can have multiple static method )
    static void printData()
    {
        System.out.println("This is Static method in Functional Interface");
    }

}
public class With_Default_Demo4 {
    public static void main(String[] args) {
        MyFunctionInterface m = (msg) -> System.out.println("Message : "+msg);

//        calling Abstract method
        m.display("This is Abstract method from Functional Interface");

//        calling Default method
        m.showMsg();

//        Static method calling with class name
        MyFunctionInterface.printData();

    }
}
