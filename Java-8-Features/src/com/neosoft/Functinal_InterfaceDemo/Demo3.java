package com.neosoft.Functinal_InterfaceDemo;
interface Calculate{
    int add(int a, int b);
}
public class Demo3 {
    public static void main(String[] args) {
        Calculation calc = (a,b) -> a-b ;
        System.out.println(" Subtraction is : "+calc.add(12,5));

    }
}
