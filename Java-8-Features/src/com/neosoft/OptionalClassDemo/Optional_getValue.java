package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Optional_getValue {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("Ashok");

//        getting value
        String value = s.orElse("Default Value");
        System.out.println(value);

//        Transform value
        Optional<String> toUpper = s.map(String::toUpperCase);
        System.out.println("To Upper Case  : "+toUpper.get());

//        Filter value
        Optional<String> filterValue = s.filter(val -> val.length() > 3);
        filterValue.ifPresent(val -> System.out.println("Filter value is : "+val));

    }
}
