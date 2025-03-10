package com.neosoft.Functinal_InterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate to check is num is even or not
//        Predicate take one input and  return boolean result
        Predicate<Integer> isEven = num -> num % 2 ==0;
        System.out.println("Is 10 is Even?  "+isEven.test(10));
        System.out.println("Is 7 is Even?  "+isEven.test(7));
    }
}
