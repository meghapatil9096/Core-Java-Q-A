package com.neosoft.LocalVariableDemo;

public class LocalVariableDemo {

    void m1()
    {
        int a =10;  //local variable is final
        int b;  // we cannot only declare local variable we have to intialize
        System.out.println("Local Variable is "+a);
    }

    public static void main(String[] args) {
        LocalVariableDemo l = new LocalVariableDemo();
        l.m1();
    }
}
