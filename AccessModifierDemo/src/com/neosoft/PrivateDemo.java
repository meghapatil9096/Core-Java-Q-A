package com.neosoft;

public class PrivateDemo {

//    private global variable
    private int a=10;

//    private constructor
    private PrivateDemo()
    {
       System.out.println("Inside Private Constructor");
    }

//  private method
    private void m1()
    {
        System.out.println("Inside Private method");
    }
//  private inner class
    private  class A
    {

    }

    public static void main(String[] args) {
            PrivateDemo p = new PrivateDemo();

            p.m1();

            System.out.println("Private variable is "+p.a);




    }
}
