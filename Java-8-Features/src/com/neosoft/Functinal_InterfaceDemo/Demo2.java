package com.neosoft.Functinal_InterfaceDemo;

interface Square{
    int sqr(int x); //single abstract method
}

public class Demo2 {
    public static void main(String[] args) {
        int a=5;

        Square s = (x)-> x * x;

//        int ans = s.sqr(a);
//        System.out.println("Square of X is : "+ans);

        System.out.println("Square of X is : "+s.sqr(a));
    }
}
