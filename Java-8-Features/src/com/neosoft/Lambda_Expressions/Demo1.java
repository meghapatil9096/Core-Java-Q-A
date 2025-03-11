package com.neosoft.Lambda_Expressions;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo1 {

    public String m1() {
        return "s";
    }

    public static void main(String[] args) {

        Supplier<String> supplier= ()->{
            return "hi";
        };
        String s1= supplier.get();
        System.out.println(s1);


      //  Supplier<String> d = ()-> Supplier String d1 = d.get();


        Function<Integer,Integer> l = a ->  a+a;
        int a= l.apply(10);
        System.out.println("Add : "+a);

        Consumer<String> c = a1 -> System.out.println("Hello "+a1);
        c.accept("Sumit");

        Supplier<Integer> s = () -> new Random().nextInt(0,100);
        System.out.println("Random access between 0 to 100 is : "+s.get());

        Predicate<Integer> p = (a2) -> a2 % 2 == 0;
        System.out.println(p.test(28));
    }
}