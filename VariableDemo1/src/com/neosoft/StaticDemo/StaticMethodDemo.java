package com.neosoft.StaticDemo;

public class StaticMethodDemo {

    static  int b=10;
     int a;

    static void m1()
    {
//        we cannot access non static variable in static methode
//        a=11;
        System.out.println(" inside Static method ");
    }

    public void m2()
    {
        System.out.println("we can access static variable inside non static method "+b);
    }

    public static void main(String[] args) {

//      1st way  call static method with direct class name
        StaticMethodDemo.m1();

//      2nd way call static variable with object of class
        StaticMethodDemo s = new StaticMethodDemo();
        s.m1();

//      3rd way call static variable with null reference
        StaticMethodDemo s1 = null;
        s1.m1();

        s.m2();
    }

}
