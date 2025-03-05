package com.neosoft.StaticDemo;

public class StaticVariable {

    static  int b=10;
    static  int a;

    void m1()
    {
        a=11;
        System.out.println("Static variable initilalize inside method "+a);
    }

    public static void main(String[] args) {

        StaticVariable s = new StaticVariable();
        s.m1();

//        1st way
        System.out.println("call static variable with direct class name "+StaticVariable.a);

//        2nd way
        System.out.println("call static variable with object of class "+b);

//        3rd way
        StaticVariable s1 = null;
        System.out.println("call static variable with null reference "+b);
    }

}
