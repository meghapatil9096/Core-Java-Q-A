package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Optional_Empty {
    public static void main(String[] args) {
        Optional<String> p = Optional.of("");
        if (p.isPresent())
        {
            System.out.println("is Empty");
        }
//        Optional.empty
        Optional<String> s = Optional.empty();

//        Optional.of(Value)
        Optional<String> s1 = Optional.of("Hello");
        if(s1.isPresent())
        {
            System.out.println("Value is Present");
        }

//        Optional.ofNullable
        Optional<String> s2 = Optional.ofNullable(null);
        if(s2.isPresent())
        {
            System.out.println("s2 Value is Present");
        }
        System.out.println("s2 value is null");


    }
}
