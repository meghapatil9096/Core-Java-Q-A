package com.neosoft.Lambda_Expressions;
interface  Zero_Parameter{
    void display();
}
public class Zero_ParametersDemo {
    public static void main(String[] args) {
        Zero_Parameter zp = () -> System.out.println("This is Zero-Parameter in Lambda Expressions");
        zp.display();
    }
}
