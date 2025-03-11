package com.neosoft.lambda;

import java.util.function.Consumer;

public class SampleImpl {

    public static void main(String[] args) {

        Consumer<Integer> c = (a) ->{
            System.out.println("Inside getDAta() method");
        };
        c.accept(2);


    }
}
