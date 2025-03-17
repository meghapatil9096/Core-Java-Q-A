package com.neosoft.lambda;
interface Interf{
    void m1();
}
public class Demo3 {
    int x=10;

    public void m2()
    {
        int y=20;
        Interf i = () -> {
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }

    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.m2();
    }
}
