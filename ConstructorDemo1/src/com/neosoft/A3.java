package com.neosoft;

public class A3 {
    //overloading constructor
    public A3(){
        System.out.println("non-paramaterised constructor");
    }
    public A3(int a){
        System.out.println("paramaterised constructor");
    }

    public static void main(String[] args) {
        A3 a3 = new A3();

    }
}
