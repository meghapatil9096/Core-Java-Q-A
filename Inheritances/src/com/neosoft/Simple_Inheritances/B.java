package com.neosoft.Simple_Inheritances;

public class B extends A{

    void m2()
    {
        System.out.println("Child class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m2();
        b.m1();
    }
}
