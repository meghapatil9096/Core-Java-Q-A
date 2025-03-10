package com.neosoft.Lambda_Expressions;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> i = a -> a % 2 == 0 ;
        System.out.println("Is given num is Even or Not : "+i.test(11));

        Predicate<Integer> str = a -> a > 10;
        System.out.println("Given number is greater than the present number : "+str.test(20));
    }
}
