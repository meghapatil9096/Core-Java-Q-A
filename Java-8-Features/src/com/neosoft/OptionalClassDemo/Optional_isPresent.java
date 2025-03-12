package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Optional_isPresent {
    public static void main(String[] args) {
//       Checking if value is present

//        Optional.empty
        Optional<String> s = Optional.empty();

//        Optional.of(Value)..... using lambda expression
        Optional<String> s1 = Optional.of("Tushar");
        s1.ifPresent(name -> System.out.println("Hello "+name));


//        Optional.ofNullable
        Optional<String> s2 = Optional.ofNullable(null);
        if(s1.isPresent())
        {
            System.out.println("s2 Value is Present");
        }
        System.out.println("s2 value is null");
    }
}
