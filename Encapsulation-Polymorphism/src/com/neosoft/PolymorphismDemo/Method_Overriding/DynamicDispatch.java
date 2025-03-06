package com.neosoft.PolymorphismDemo.Method_Overriding;

public class DynamicDispatch {
    public static void main(String[] args) {

//  Dynamic Dispatch
        A a = new A();
        a.sum(6,7);

        B b = new B();
        b.sum(3,5);

        A a1 = new B();
        a1.sum(12,2);

//        B b1 = new A();   // it is not work
    }
}
