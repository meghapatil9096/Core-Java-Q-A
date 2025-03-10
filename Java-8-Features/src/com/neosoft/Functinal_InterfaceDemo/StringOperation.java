package com.neosoft.Functinal_InterfaceDemo;
// Functional Interface for String Operation
interface StringOperationDemo{
    String Modify(String str);
}

public class StringOperation {
    public static void main(String[] args) {

//        To Upper case
        StringOperationDemo s = (str) -> str.toUpperCase();
        System.out.println("Upper Case : "+s.Modify("java"));

//      To Lower Case
        StringOperationDemo s1 = str ->str.toLowerCase();
        System.out.println("Lower Case : "+s1.Modify("JaVa"));

//      Reverse String
        StringOperationDemo s3 = (str) ->   new StringBuilder(str).reverse().toString();
        System.out.println("Reverse Case : "+s3.Modify("java"));

    }
}
