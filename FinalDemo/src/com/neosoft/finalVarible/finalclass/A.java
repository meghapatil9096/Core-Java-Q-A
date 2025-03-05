package com.neosoft.finalVarible.finalclass;

public class A {

    final int a = 10;   // final variable

    void m1(){
//        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.a);
        a.m1();

    }
}
