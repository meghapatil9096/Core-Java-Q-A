package com.neosoft.StaticDemo;

public class StaticInnerClassDemo {

    static class PrintData
    {
        void m1()
        {
            System.out.println("Static Inner class");
        }
    }

    public static void main(String[] args) {
//      static inner class call with object of class
        StaticInnerClassDemo.PrintData s = new StaticInnerClassDemo.PrintData();
        s.m1();
    }
}
