package com.neosoft.Lambda_Expressions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        Generate random number between 0 - 99
        Supplier<Integer> i = () -> new Random().nextInt(100);
        System.out.println("Random Number : "+i.get());
    }
}
