package com.basic_questions.StringReplace;

public class StringWith_ReplaceMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        char oldchar = 'o';
        char newchar ='x';

        String newstr = str.replace(oldchar,newchar);
        System.out.println(newstr);

    }
}
