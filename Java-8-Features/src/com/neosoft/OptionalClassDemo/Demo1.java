package com.neosoft.OptionalClassDemo;

import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        System.out.println(name.orElse("Default Name"));

        name = "Gopal".describeConstable();
        System.out.println(name.orElse("Default name"));
    }
}
