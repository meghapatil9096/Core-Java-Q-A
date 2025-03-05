package com.neosoft;
//public class
public class PublicDemo {

// public global variable
    public int a=2;


//    public constructor
    public PublicDemo()
    {
        System.out.println("Inside Public Constructor");
    }


//    public method
    public void  m1()
    {
//        we cannot declare public to local variable
//        public int a=4;
        System.out.println("Inside Public method m1() ");
    }

    public static void main(String[] args) {

        PublicDemo p = new PublicDemo();
        p.m1();

        System.out.println("calling public global variable : "+p.a);


    }
}
