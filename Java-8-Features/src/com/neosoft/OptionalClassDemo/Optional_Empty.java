package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Optional_Empty {
    public static void main(String[] args) {
//  creating Optional object
        Optional<String> p = Optional.of("");

//        Optional.empty
        Optional<String> s = Optional.empty();

//        Optional.of(Value)
        Optional<String> s1 = Optional.of("Hello");

//        Optional.ofNullable
        Optional<String> s2 = Optional.ofNullable(null);
    }
}
