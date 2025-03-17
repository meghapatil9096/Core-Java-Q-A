package com.neosoft.lambda;

import java.util.function.Supplier;

public class SupplieDemo {
    public static void main(String[] args) {
        Supplier<String> s = ()-> {
            String s1[] = {"Sunny", "Bunny","gunny","yummy"};
            int x =  (int)(Math.random()*3+1);
            return s1[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
