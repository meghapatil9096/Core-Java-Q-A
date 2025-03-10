package com.neosoft.Lambda_Expressions;
interface Calculation{
    int operate(int a, int b);
}
public class Multiple_ParameterDemo {
    public static void main(String[] args) {
//        Multiple Parameter
        Calculation add =  (a,b) -> a+b;
        Calculation multi = (a,b) -> a*b;

        System.out.println("Sum : "+add.operate(6,5));
        System.out.println("Multi : "+multi.operate(2,4));
    }
}
