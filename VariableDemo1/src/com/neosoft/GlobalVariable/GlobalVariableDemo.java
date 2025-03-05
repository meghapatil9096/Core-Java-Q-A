package com.neosoft.GlobalVariable;

public class GlobalVariableDemo {

    int a;
    int b=10;

    void m1()
    {
        a=10;
        System.out.println("Initilization of a Inside of method "+a);
    }

    public static void main(String[] args) {
        GlobalVariableDemo g = new GlobalVariableDemo();
        g.m1();
        System.out.println("Instances variable call througth the object of class is "+g.b);
    }


}
