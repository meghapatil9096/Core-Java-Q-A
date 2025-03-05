package com.neosoft;

//default class
 class DefaultDemo {

//     default variable
     int a = 5;

//  Default constructor
    DefaultDemo()
    {
        System.out.println("Inside Default constructor");
    }
//  Default method
    void m1()
    {
        System.out.println("Inside Default method");
    }

    public static void main(String[] args) {
        DefaultDemo d = new DefaultDemo();
        System.out.println(d.a);
        d.m1();
    }
}
