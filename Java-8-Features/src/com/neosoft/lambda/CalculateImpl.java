package com.neosoft.lambda;

public class CalculateImpl {

    public static void main(String[] args) {

         Calculate c= (b) -> {
            return b*4;
        };
//        1st way to print
        System.out.println(c.getMultiplication(4));

//         2nd way to print to store in variable and then print that variable
         int i =c.getMultiplication(5);
        System.out.println(i);
    }
}
