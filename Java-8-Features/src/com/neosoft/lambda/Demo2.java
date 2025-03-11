package com.neosoft.lambda;

import java.util.function.Predicate;

public class Demo2 {

    public static void main(String[] args) {

        Predicate<Integer> p = (a)-> {
           if(a % 2 == 0)
            {
                System.out.println("Even");
            }
            return false;
        };
        p.test(4);

//        System.out.println("Is even number? : "+p.test(4));
    }

}
