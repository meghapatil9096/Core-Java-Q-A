package com.neosoft.Functinal_InterfaceDemo;

interface Calculation{
    int add(int a, int b);  //Function Interface with single or only one abstract method

}
public class Demo1 {
    public static void main(String[] args) {
        Calculation calc = (a,b)-> a+b; //Lambda Expression () -> Parameters/Arguments
        System.out.println("Sum : "+calc.add(4,5));
    }
}
