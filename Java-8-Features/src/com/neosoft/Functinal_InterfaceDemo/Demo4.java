package com.neosoft.Functinal_InterfaceDemo;
@FunctionalInterface
interface Calculator{
    int operate(int a, int b);
}
public class Demo4 {
    public static void main(String[] args) {
        Calculator add = (a,b)-> a+b;
        System.out.println("Sum : "+add.operate(5,6));

        Calculator multi = (a,b) -> a*b;
        System.out.println("Multiple : "+multi.operate(3,5));

        Calculator sub = (a,b) -> a-b;
        System.out.println("subtract : "+sub.operate(8,5));

        Calculator div = (a,b)-> a/b;
        System.out.println("Division : "+div.operate(10,2));
    }
}
