package com.neosoft.lambda;

public class Demo1Impl {
    public static void main(String[] args) {
        Demo1 i=(a, b) -> {
            int sum = a*b;
            return sum;
        };
//        we can do in this way also
        int A=i.printData(4,2);
        System.out.println(A);
//        simple way
        System.out.println(i.printData(2,3));
    }
}
