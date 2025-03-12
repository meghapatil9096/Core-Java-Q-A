package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Optional_Array {
    public static void main(String[] args) {
//       Create Array
        String s[] = new String[5];

        s[2] = "Hello Everyone";

//      it return non-empty
        Optional<String> val = Optional.of(s[2]);

        System.out.println(val.get());

        System.out.println(val.isPresent());
    }
}
