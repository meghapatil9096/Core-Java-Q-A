package com.neosoft.Lambda_Expressions;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> add = a -> a+3;
        System.out.println(add.apply(10));
    }
}
