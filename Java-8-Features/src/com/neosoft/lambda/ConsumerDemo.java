package com.neosoft.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> str = (s) -> System.out.println("Welcome  "+s);
        str.accept("Abhishekh");
        str.accept("Ashok");
    }
}
