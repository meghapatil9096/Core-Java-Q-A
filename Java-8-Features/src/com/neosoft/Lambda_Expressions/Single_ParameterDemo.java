package com.neosoft.Lambda_Expressions;

import java.util.ArrayList;

public class Single_ParameterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//      Using Lambda Expression to print all elements
        System.out.println("Print all elements from ArrayList");

//     2)Type - Single Parameter
        list.forEach(i -> System.out.println(i));
        System.out.println("Print all elements using method reference");
        list.forEach(System.out::println);                 //method reference

//       Using Lambda Expression to print even
        System.out.println("print only even number from ArrayList");
        list.forEach(n ->{
            if(n % 2 == 0)
                System.out.println(n);
        });
    }
}
