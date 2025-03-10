package com.neosoft.Functinal_InterfaceDemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<T,R> -> Take input T type and return R
        Function<Integer,Integer> square = a -> a*a;
        System.out.println("Square : "+square.apply(5));
    }
}
