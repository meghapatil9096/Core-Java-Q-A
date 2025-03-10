package com.neosoft.Lambda_Expressions;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Single Parameter
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);


    }
}
